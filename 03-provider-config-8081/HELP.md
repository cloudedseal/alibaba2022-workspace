# Getting Started

## 共享配置，同一个 group

1. 不同的微服务，使用同一个 group 同一个配置
```yml
spring:
  cloud:
    nacos:
      config:
        server-addr: localhost:8848
        file-extension: yml # 使用的配置类型。默认 properties
        username: nacos
        password: nacos
        shared-configs[0]:
          data-id: shareconfig.yml
          refresh: true
        shared-configs[1]:
          data-id: shareconfig2.yml
          refresh: true

```
## 扩展配置，不同 group
1. 不同的微服务，使用不同 group 同一个配置
```yml
spring:
  application:
    name: depart-provider
  cloud:
    nacos:
      config:
        server-addr: localhost:8848
        file-extension: yml # 使用的配置类型。默认 properties
        username: nacos
        password: nacos
        extension-configs[0]:
          data-id: extensionconfig.yml
          refresh: true
        extension-configs[1]:
          data-id: extensionconfig2.yml
          refresh: true

```
## 配置加载顺序
1. 共享配置
2. 扩展配置
3. 当前服务配置
后加载的会覆盖相同的配置。优先级和加载顺序相反。

## 配置文件都在哪里？

### 1. 快照文件

```bash
~/nacos
$ tree .
.
├── config
│   └── fixed-localhost_8848_nacos
│       ├── encrypted-data-key
│       │   └── snapshot
│       │       └── DEFAULT_GROUP
│       │           └── depart-provider.yml
│       └── snapshot 
│           └── DEFAULT_GROUP
│               └── depart-provider.yml
└── naming
    ├── 52261b42-9d08-459b-9870-070477b5d172
    │   └── failover
    └── public
        └── failover
```

### 2. 远程 nacos 存储配置

### 3. 主动写入的配置
```bash
config/fixed-localhost_8848_nacos/data/config-data/DEFAULT_GROUP/provider-depart.yml
```

### 4. 配置文件加载顺序
1. 本地主动写入的配置
2. 远程 nacos 存储配置
3. 快照
只要加载到一个，就不再继续加载了

## 配置动态更新
1. @RefreshScope
2. 修改配置
3. 相关日志
```bash
level-INFO [501ffcf5-6da7-4c2e-aa6c-99386e8abd95_config-0] Receive server push request, request = ConfigChangeNotifyRequest, requestId = 2
level-INFO [501ffcf5-6da7-4c2e-aa6c-99386e8abd95_config-0] [server-push] config changed. dataId=depart-provider.yml, group=DEFAULT_GROUP,tenant=null
level-INFO [501ffcf5-6da7-4c2e-aa6c-99386e8abd95_config-0] Ack server push request, request = ConfigChangeNotifyRequest, requestId = 2
level-INFO [fixed-localhost_8848] [data-received] dataId=depart-provider.yml, group=DEFAULT_GROUP, tenant=, md5=c545fcacb82defdaa40e0a6522a49aa1, content=depart:
  name: "new-value"
server:
  port: 8081
spring:
  jpa:
    # auto create table
    generate..., type=yaml
level-INFO [fixed-localhost_8848] [notify-listener] time cost=0ms in ClientWorker, dataId=depart-provider.yml, group=DEFAULT_GROUP, md5=c545fcacb82defdaa40e0a6522a49aa1, listener=com.alibaba.cloud.nacos.refresh.NacosContextRefresher$1@609651de 
level-INFO [fixed-localhost_8848] [notify-context] dataId=depart-provider.yml, group=DEFAULT_GROUP, md5=c545fcacb82defdaa40e0a6522a49aa1
level-INFO Cannot determine local hostname
level-INFO [Nacos Config] Load config[dataId=depart-provider.yml, group=DEFAULT_GROUP] success
level-INFO Refresh keys changed: [depart.name]
level-INFO [fixed-localhost_8848] [notify-ok] dataId=depart-provider.yml, group=DEFAULT_GROUP, md5=c545fcacb82defdaa40e0a6522a49aa1, listener=com.alibaba.cloud.nacos.refresh.NacosContextRefresher$1@609651de ,cost=1052 millis.
```