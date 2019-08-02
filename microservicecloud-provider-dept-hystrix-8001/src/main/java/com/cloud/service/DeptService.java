package com.cloud.service;

import com.cloud.entity.Dept;

import java.util.List;

/**
 * @author 孙小云
 * @version 1.0
 * @date 2019/8/2 13:50
 **/
public interface DeptService {


    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();

}
