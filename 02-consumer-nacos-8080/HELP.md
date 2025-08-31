# Getting Started


# nacos 服务注册日志

```bash
Connected to the target VM, address: '127.0.0.1:65108', transport: 'socket'
17:01:25.690 [main] DEBUG reactor.util.Loggers -- Using Slf4j logging framework
17:01:25.695 [main] DEBUG reactor.core.publisher.Hooks -- Enabling stacktrace debugging via onOperatorDebug
2025-08-31T17:01:26.649+08:00 DEBUG 62727 --- [           main] c.a.n.client.env.SearchableProperties    : properties search order:PROPERTIES->JVM->ENV->DEFAULT_SETTING
2025-08-31T17:01:26.655+08:00  WARN 62727 --- [           main] c.a.nacos.client.logging.NacosLogging    : Load Logback Configuration of Nacos fail, message: Could not initialize Logback Nacos logging from classpath:nacos-logback.xml

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.6)

2025-08-31T17:01:26.701+08:00  WARN 62727 --- [           main] c.a.nacos.client.logging.NacosLogging    : Load Logback Configuration of Nacos fail, message: Could not initialize Logback Nacos logging from classpath:nacos-logback.xml
2025-08-31T17:01:26.709+08:00  INFO 62727 --- [           main] com.abc.NacosConsumer8080Application     : Starting NacosConsumer8080Application using Java 24.0.1 with PID 62727 (Documents/alibaba2022-workspace/02-consumer-nacos-8080/target/classes started by yang in Documents/alibaba2022-workspace)
2025-08-31T17:01:26.710+08:00  INFO 62727 --- [           main] com.abc.NacosConsumer8080Application     : No active profile set, falling back to 1 default profile: "default"
2025-08-31T17:01:27.249+08:00  INFO 62727 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=095eae33-2def-3938-ad06-9ce49eceede5

2025-08-31T17:01:27.492+08:00  INFO 62727 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2025-08-31T17:01:27.501+08:00  INFO 62727 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-08-31T17:01:27.502+08:00  INFO 62727 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.8]
2025-08-31T17:01:27.578+08:00  INFO 62727 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-08-31T17:01:27.578+08:00  INFO 62727 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 822 ms
2025-08-31T17:01:28.075+08:00  WARN 62727 --- [           main] iguration$LoadBalancerCaffeineWarnLogger : Spring Cloud LoadBalancer is currently working with the default cache. While this cache implementation is useful for development and tests, it's recommended to use Caffeine cache in production.You can switch to using Caffeine cache, by adding it and org.springframework.cache.caffeine.CaffeineCacheManager to the classpath.
2025-08-31T17:01:28.127+08:00  INFO 62727 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2025-08-31T17:01:28.134+08:00  WARN 62727 --- [           main] c.a.nacos.client.logging.NacosLogging    : Load Logback Configuration of Nacos fail, message: Could not initialize Logback Nacos logging from classpath:nacos-logback.xml
2025-08-31T17:01:28.134+08:00  INFO 62727 --- [           main] com.alibaba.nacos.client.naming          : initializer namespace from ans.namespace attribute : null
2025-08-31T17:01:28.134+08:00  INFO 62727 --- [           main] com.alibaba.nacos.client.naming          : initializer namespace from ALIBABA_ALIWARE_NAMESPACE attribute :null
2025-08-31T17:01:28.135+08:00  INFO 62727 --- [           main] com.alibaba.nacos.client.naming          : initializer namespace from namespace attribute :null
2025-08-31T17:01:28.144+08:00 DEBUG 62727 --- [naming.failover] com.alibaba.nacos.client.naming          : failover switch is not found, 00-00---000-VIPSRV_FAILOVER_SWITCH-000---00-00
2025-08-31T17:01:28.155+08:00  INFO 62727 --- [           main] c.alibaba.nacos.client.utils.ParamUtil   : [settings] [req-serv] nacos-server port:8848
2025-08-31T17:01:28.155+08:00  INFO 62727 --- [           main] c.alibaba.nacos.client.utils.ParamUtil   : [settings] [http-client] connect timeout:1000
2025-08-31T17:01:28.156+08:00  INFO 62727 --- [           main] c.alibaba.nacos.client.utils.ParamUtil   : PER_TASK_CONFIG_SIZE: 3000.0
2025-08-31T17:01:28.159+08:00  INFO 62727 --- [           main] c.a.n.p.a.s.c.ClientAuthPluginManager    : [ClientAuthPluginManager] Load ClientAuthService com.alibaba.nacos.client.auth.impl.NacosClientAuthServiceImpl success.
2025-08-31T17:01:28.159+08:00  INFO 62727 --- [           main] c.a.n.p.a.s.c.ClientAuthPluginManager    : [ClientAuthPluginManager] Load ClientAuthService com.alibaba.nacos.client.auth.ram.RamClientAuthServiceImpl success.
2025-08-31T17:01:28.163+08:00 DEBUG 62727 --- [           main] com.alibaba.nacos.client.naming          : HTTP method: POST, url: http://localhost:8848/nacos/v1/auth/users/login?username=nacos, body: {password=nacos}
2025-08-31T17:01:28.307+08:00  INFO 62727 --- [           main] c.a.n.c.a.r.identify.CredentialWatcher   : null No credential found
2025-08-31T17:01:28.315+08:00  INFO 62727 --- [           main] com.alibaba.nacos.common.remote.client   : [RpcClientFactory] create a new rpc client of bf9714b0-f674-4f31-8b37-255170a3431a
2025-08-31T17:01:28.331+08:00  INFO 62727 --- [           main] com.alibaba.nacos.common.remote.client   : [bf9714b0-f674-4f31-8b37-255170a3431a] RpcClient init, ServerListFactory = com.alibaba.nacos.client.naming.core.ServerListManager
2025-08-31T17:01:28.331+08:00  INFO 62727 --- [           main] com.alibaba.nacos.common.remote.client   : [bf9714b0-f674-4f31-8b37-255170a3431a] Registry connection listener to current client:com.alibaba.nacos.client.naming.remote.gprc.redo.NamingGrpcRedoService
2025-08-31T17:01:28.331+08:00  INFO 62727 --- [           main] com.alibaba.nacos.common.remote.client   : [bf9714b0-f674-4f31-8b37-255170a3431a] Register server push request handler:com.alibaba.nacos.client.naming.remote.gprc.NamingPushRequestHandler
2025-08-31T17:01:28.332+08:00  INFO 62727 --- [           main] com.alibaba.nacos.common.remote.client   : [bf9714b0-f674-4f31-8b37-255170a3431a] Try to connect to server on start up, server: {serverIp = 'localhost', server main port = 8848}
2025-08-31T17:01:28.354+08:00  INFO 62727 --- [           main] c.a.n.c.remote.client.grpc.GrpcClient    : grpc client connection server:localhost ip,serverPort:9848,grpcTslConfig:{"sslProvider":"OPENSSL","enableTls":false,"mutualAuthEnable":false,"trustAll":false}
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by com.alibaba.nacos.shaded.io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent0$4 (file:.m2/repository/com/alibaba/nacos/nacos-client/2.2.1/nacos-client-2.2.1.jar)
WARNING: Please consider reporting this to the maintainers of class com.alibaba.nacos.shaded.io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent0$4
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
2025-08-31T17:01:28.962+08:00  INFO 62727 --- [           main] com.alibaba.nacos.common.remote.client   : [bf9714b0-f674-4f31-8b37-255170a3431a] Success to connect to server [localhost:8848] on start up, connectionId = 1756630888801_127.0.0.1_65114
2025-08-31T17:01:28.963+08:00  INFO 62727 --- [t.remote.worker] com.alibaba.nacos.common.remote.client   : [bf9714b0-f674-4f31-8b37-255170a3431a] Notify connected event to listeners.
2025-08-31T17:01:28.963+08:00  INFO 62727 --- [t.remote.worker] com.alibaba.nacos.client.naming          : Grpc connection connect
2025-08-31T17:01:28.963+08:00  INFO 62727 --- [           main] com.alibaba.nacos.common.remote.client   : [bf9714b0-f674-4f31-8b37-255170a3431a] Register server push request handler:com.alibaba.nacos.common.remote.client.RpcClient$ConnectResetRequestHandler
2025-08-31T17:01:28.963+08:00  INFO 62727 --- [           main] com.alibaba.nacos.common.remote.client   : [bf9714b0-f674-4f31-8b37-255170a3431a] Register server push request handler:com.alibaba.nacos.common.remote.client.RpcClient$$Lambda/0x000000011f4ec008
2025-08-31T17:01:28.964+08:00  INFO 62727 --- [           main] com.alibaba.nacos.client.naming          : [REGISTER-SERVICE] public registering service depart-consumer with instance Instance{instanceId='null', ip='192.168.0.100', port=8080, weight=1.0, healthy=true, enabled=true, ephemeral=true, clusterName='DEFAULT', serviceName='null', metadata={IPv6=null, preserved.register.source=SPRING_CLOUD}}

2025-08-31T17:01:28.979+08:00  INFO 62727 --- [           main] c.a.c.n.registry.NacosServiceRegistry    : nacos registry, DEFAULT_GROUP depart-consumer 192.168.0.100:8080 register finished

2025-08-31T17:01:28.988+08:00  INFO 62727 --- [           main] com.abc.NacosConsumer8080Application     : Started NacosConsumer8080Application in 2.638 seconds (process running for 4.028)
2025-08-31T17:01:33.149+08:00 DEBUG 62727 --- [naming.failover] com.alibaba.nacos.client.naming          : failover switch is not found, 00-00---000-VIPSRV_FAILOVER_SWITCH-000---00-00
2025-08-31T17:01:38.149+08:00 DEBUG 62727 --- [naming.failover] com.alibaba.nacos.client.naming          : failover switch is not found, 00-00---000-VIPSRV_FAILOVER_SWITCH-000---00-00
2025-08-31T17:01:43.154+08:00 DEBUG 62727 --- [naming.failover] com.alibaba.nacos.client.naming          : failover switch is not found, 00-00---000-VIPSRV_FAILOVER_SWITCH-000---00-00
2025-08-31T17:01:48.157+08:00 DEBUG 62727 --- [naming.failover] com.alibaba.nacos.client.naming          : failover switch is not found, 00-00---000-VIPSRV_FAILOVER_SWITCH-000---00-00
Disconnected from the target VM, address: '127.0.0.1:65108', transport: 'socket'
2025-08-31T17:01:52.708+08:00  WARN 62727 --- [       Thread-7] c.a.n.common.http.HttpClientBeanHolder   : [HttpClientBeanHolder] Start destroying common HttpClient
2025-08-31T17:01:52.708+08:00  WARN 62727 --- [       Thread-4] c.a.nacos.common.notify.NotifyCenter     : [NotifyCenter] Start destroying Publisher
2025-08-31T17:01:52.708+08:00  WARN 62727 --- [       Thread-4] c.a.nacos.common.notify.NotifyCenter     : [NotifyCenter] Destruction of the end
2025-08-31T17:01:52.709+08:00  WARN 62727 --- [       Thread-7] c.a.n.common.http.HttpClientBeanHolder   : [HttpClientBeanHolder] Destruction of the end
2025-08-31T17:01:53.161+08:00 DEBUG 62727 --- [naming.failover] com.alibaba.nacos.client.naming          : failover switch is not found, 00-00---000-VIPSRV_FAILOVER_SWITCH-000---00-00

2025-08-31T17:01:53.730+08:00  INFO 62727 --- [ionShutdownHook] c.a.c.n.registry.NacosServiceRegistry    : De-registering from Nacos Server now...

2025-08-31T17:01:53.730+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : [DEREGISTER-SERVICE] public deregistering service depart-consumer with instance: Instance{instanceId='null', ip='192.168.0.100', port=8080, weight=1.0, healthy=true, enabled=true, ephemeral=true, clusterName='DEFAULT', serviceName='null', metadata={}}
2025-08-31T17:01:53.736+08:00  INFO 62727 --- [ionShutdownHook] c.a.c.n.registry.NacosServiceRegistry    : De-registration finished.
2025-08-31T17:01:53.736+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : com.alibaba.nacos.client.naming.cache.ServiceInfoHolder do shutdown begin
2025-08-31T17:01:53.736+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : com.alibaba.nacos.client.naming.backups.FailoverReactor do shutdown begin
2025-08-31T17:01:53.736+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : com.alibaba.nacos.client.naming.backups.FailoverReactor do shutdown stop
2025-08-31T17:01:53.736+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : com.alibaba.nacos.client.naming.cache.ServiceInfoHolder do shutdown stop
2025-08-31T17:01:53.736+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : com.alibaba.nacos.client.naming.remote.NamingClientProxyDelegate do shutdown begin
2025-08-31T17:01:53.736+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : com.alibaba.nacos.client.naming.core.ServiceInfoUpdateService do shutdown begin
2025-08-31T17:01:53.737+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : com.alibaba.nacos.client.naming.core.ServiceInfoUpdateService do shutdown stop
2025-08-31T17:01:53.737+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : com.alibaba.nacos.client.naming.core.ServerListManager do shutdown begin
2025-08-31T17:01:53.737+08:00  WARN 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : [NamingHttpClientManager] Start destroying NacosRestTemplate
2025-08-31T17:01:53.737+08:00  WARN 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : [NamingHttpClientManager] Destruction of the end
2025-08-31T17:01:53.737+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : com.alibaba.nacos.client.naming.core.ServerListManager do shutdown stop
2025-08-31T17:01:53.737+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : com.alibaba.nacos.client.naming.remote.http.NamingHttpClientProxy do shutdown begin
2025-08-31T17:01:53.737+08:00  WARN 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : [NamingHttpClientManager] Start destroying NacosRestTemplate
2025-08-31T17:01:53.737+08:00  WARN 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : [NamingHttpClientManager] Destruction of the end
2025-08-31T17:01:53.737+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : com.alibaba.nacos.client.naming.remote.http.NamingHttpClientProxy do shutdown stop
2025-08-31T17:01:53.737+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.common.remote.client   : Shutdown rpc client, set status to shutdown
2025-08-31T17:01:53.737+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.common.remote.client   : Shutdown client event executor java.util.concurrent.ScheduledThreadPoolExecutor@703fa45[Running, pool size = 2, active threads = 2, queued tasks = 0, completed tasks = 0]
2025-08-31T17:01:53.737+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.common.remote.client   : Close current connection 1756630888801_127.0.0.1_65114
2025-08-31T17:01:53.738+08:00  INFO 62727 --- [or-localhost-19] c.a.n.c.remote.client.grpc.GrpcClient    : [1756630888801_127.0.0.1_65114]Ignore complete event,isRunning:false,isAbandon=false
2025-08-31T17:01:53.739+08:00  INFO 62727 --- [ionShutdownHook] c.a.n.c.remote.client.grpc.GrpcClient    : Shutdown grpc executor java.util.concurrent.ThreadPoolExecutor@52354202[Running, pool size = 7, active threads = 0, queued tasks = 0, completed tasks = 20]
2025-08-31T17:01:53.739+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : Shutdown grpc redo service executor java.util.concurrent.ScheduledThreadPoolExecutor@63e5b8aa[Running, pool size = 1, active threads = 0, queued tasks = 1, completed tasks = 8]
2025-08-31T17:01:53.740+08:00  INFO 62727 --- [ionShutdownHook] c.a.n.c.a.r.identify.CredentialWatcher   : [null] CredentialWatcher is stopped
2025-08-31T17:01:53.740+08:00  INFO 62727 --- [ionShutdownHook] c.a.n.c.a.r.identify.CredentialService   : [null] CredentialService is freed
2025-08-31T17:01:53.740+08:00  INFO 62727 --- [ionShutdownHook] com.alibaba.nacos.client.naming          : com.alibaba.nacos.client.naming.remote.NamingClientProxyDelegate do shutdown stop

```

