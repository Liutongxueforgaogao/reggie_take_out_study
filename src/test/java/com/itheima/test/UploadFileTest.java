package com.itheima.test;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.itheima.reggie.entity.Category;
import com.itheima.reggie.entity.Employee;
import com.itheima.reggie.mapper.AddressBookMapper;
import com.itheima.reggie.mapper.CategoryMapper;
import com.itheima.reggie.mapper.EmployeeMapper;
import com.itheima.reggie.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = UploadFileTest.class)
@MapperScan("com.itheima.reggie.mapper")
public class UploadFileTest {
//    @Autowired
//    public EmployeeMapper employeeMapper;
//
//    @Autowired
//    public CategoryMapper categoryMapper;
//
//    @Autowired
//    private EmployeeService employeeService;

    @Test
    public void test1(){
        String fileName = "ererewe.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }

    @Test
    public void test2(){
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
//        List<Category> categories = categoryMapper.selectList(queryWrapper);
        System.out.println(1);
    }
}
