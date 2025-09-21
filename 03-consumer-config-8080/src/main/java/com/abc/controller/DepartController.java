package com.abc.controller;


import com.abc.bean.Depart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer/depart")
public class DepartController {

    @Autowired
    private RestTemplate template;

    // 直连方式，写死了---> 改成为微服务名
//    private static final String SERVICE_PROVIDER = "http://localhost:8081/provider/depart";
    private static final String micro_service_name = "depart-provider";
    private static final String SERVICE_PROVIDER = "http://depart-provider/provider/depart";

    @PostMapping("/save")
    public boolean saveHandle(@RequestBody Depart depart) {
        String url = SERVICE_PROVIDER + "/save";
        return template.postForObject(url, depart, Boolean.class);
    }

    @DeleteMapping("/del/{id}")
    public void delHandle(@PathVariable("id") int id) {
        String url = SERVICE_PROVIDER + "/del/" + id;
        template.delete(url);
    }

    @PutMapping("/update")
    public void updateHandle(@RequestBody Depart depart) {
        String url = SERVICE_PROVIDER + "/update";
         template.put(url, depart);
    }

    @GetMapping("/get/{id}")
    public Depart getHandle(@PathVariable("id") int id) {
        String url = SERVICE_PROVIDER + "/get/" + id;
        return template.getForObject(url, Depart.class);
    }

    @GetMapping("/list")
    public List<Depart> listHandle() {
        String url = SERVICE_PROVIDER + "/list";
        return template.getForObject(url, List.class);
    }



}
