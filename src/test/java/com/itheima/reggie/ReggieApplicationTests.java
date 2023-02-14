package com.itheima.reggie;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.itheima.reggie.entity.Category;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ReggieApplicationTests {
//    @Autowired
//    public EmployeeMapper employeeMapper;
//
//    @Autowired
//    public CategoryMapper categoryMapper;
//
//    @Autowired
//    private EmployeeService employeeService;

//    @Test
//    void test1(){
//        String fileName = "ererewe.jpg";
//        String suffix = fileName.substring(fileName.lastIndexOf("."));
//        System.out.println(suffix);
//    }

    @Test
    void test2(){
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
//        List<Category> categories = categoryMapper.selectList(queryWrapper);
        System.out.println(1);
    }
}
