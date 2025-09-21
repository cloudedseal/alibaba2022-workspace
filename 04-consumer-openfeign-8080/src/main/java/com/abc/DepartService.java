package com.abc;


import com.abc.bean.Depart;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 消费的微服务
@FeignClient(value = "depart-provider", path = "/provider/depart")
public interface DepartService {

    @PostMapping("/save")
    boolean saveDepart(Depart depart);

    @DeleteMapping("/del/{id}")
    boolean removeDepartById(@PathVariable("id") Integer id);

    @PutMapping("/update")
    boolean modifyDepart(Depart depart);

    @GetMapping("/get/{id}")
    Depart getDepartById(@PathVariable("id") Integer id);

    @GetMapping("/list")
    List<Depart> listAllDeparts();

}
