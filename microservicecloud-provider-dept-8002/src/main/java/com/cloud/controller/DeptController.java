package com.cloud.controller;

import com.cloud.entity.Dept;
import com.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 孙小云
 * @version 1.0
 * @date 2019/8/2 14:07
 **/
@RestController
public class DeptController {

    @Autowired
    DeptService deptService;

    @Qualifier("discoveryClient")
    @Autowired
    private DiscoveryClient client;


    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable Long id) {
        return deptService.get(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }





    /**
     * 服务发现：可以得到当前在eureka中已注册的服务
     *
     * @return
     */
    @GetMapping("/dept/discovery")
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("CLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                + element.getUri());
        }
        return this.client;
    }
}
