package com.cloud.service.impl;

import com.cloud.entity.Dept;
import com.cloud.mapper.DeptMapper;
import com.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 孙小云
 * @version 1.0
 * @date 2019/8/2 13:51
 **/
@Service
public class DeptImplService implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept) {
        return deptMapper.add(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.getDeptById(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
