package com.cloud.mapper;

import com.cloud.entity.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 孙小云
 * @version 1.0
 * @date 2019/8/2 13:55
 **/
@Mapper
public interface DeptMapper {

    @Insert("INSERT INTO dept(dname,db_source) VALUES(#{dname},DATABASE())")
    boolean add(Dept dept) ;

    @Select("select*from dept where id=#{id}")
    Dept getDeptById(Long id);

    @Select("select *from dept ")
    List<Dept> findAll();
}
