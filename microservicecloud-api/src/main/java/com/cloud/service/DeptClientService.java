package com.cloud.service;

import com.cloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author 孙小云
 * @version 1.0
 * 一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory
 * @date 2019/8/1 16:00
 **/

// value --->指定调用哪个服务
// fallbackFactory--->熔断器的降级提示
@FeignClient(value = "CLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    // 采用Feign我们就可以使用SpringMVC的注解来对服务进行绑定！
    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") long id);

    @GetMapping(value = "/dept/list")
    public List<Dept> list();

    @PostMapping(value = "/dept/add")
    public boolean add(Dept dept);

}
