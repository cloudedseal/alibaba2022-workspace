package com.abc.service;

import com.abc.bean.Depart;
import com.abc.repository.DepartRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.List;

@RefreshScope
@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    private DepartRepository repository;

    @Value("${server.port}")
    private String port;

    @Value("${depart.name}")
    private String departName;

    @Override
    public boolean saveDepart(Depart depart) {
        Depart save = repository.save(depart);
        if(save != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean removeDepartById(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }

    @Override
    public boolean modifyDepart(Depart depart) {
        var save = repository.save(depart);
        if(save != null) {
            return true;
        }
        return false;
    }

    @Override
    public Depart getDepartById(Integer id) {
        if (repository.existsById(id)) {
            return  repository.getReferenceById(id);
        }
        Depart depart = new Depart();
        depart.setName("this is no depart" + departName + " " + port);
        return depart;
    }

    @Override
    public List<Depart> listAllDeparts() {
        return repository.findAll();
    }
}
