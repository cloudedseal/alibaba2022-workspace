package com.abc.controller;

import com.abc.bean.Depart;
import com.abc.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/provider/depart")
@RestController
public class DepartController {
    @Autowired
    private final DepartService departService;

    @Autowired
    private DiscoveryClient discoveryClient;

    public DepartController(DepartService departService) {
        this.departService = departService;
    }

    @PostMapping("/save")
    public boolean saveHandle(@RequestBody Depart depart) {
        return departService.saveDepart(depart);
    }

    @DeleteMapping("/del/{id}")
    public boolean deleteHandle(@PathVariable("id") Integer id) {
        return departService.removeDepartById(id);
    }

    @PutMapping("/update")
    public boolean updateHandle(@RequestBody Depart depart) {
        return departService.modifyDepart(depart);
    }

    @GetMapping("/get/{id}")
    public Depart getHandle(@PathVariable("id") Integer id) {
        return departService.getDepartById(id);
    }

    @GetMapping("/list")
    public List<Depart> getAllHandle() {
        return departService.listAllDeparts();
    }


    @GetMapping("/discovery")
    public Map<Object, Object> discoveryServiceInfo() {
        Map<Object, Object> info = new HashMap<>();
        List<String> services = discoveryClient.getServices();
        for (String serviceName : services) {
            info.put(serviceName, discoveryClient.getInstances(serviceName));
        }


        return info;
    }



}
