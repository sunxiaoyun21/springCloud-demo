package com.cloud.controller;

import com.cloud.entity.Dept;
import com.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 孙小云
 * @version 1.0
 * @date 2019/8/2 16:02
 **/
@RestController("/consumer")
public class DeptController {

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/dept/list")
    public List<Dept> list() {
        return this.service.list();
    }

    @RequestMapping(value = "/dept/add")
    public Object add(Dept dept) {
        return this.service.add(dept);
    }

}
