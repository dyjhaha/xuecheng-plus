package com.xuecheng.content;

import com.xuecheng.content.mapper.CourseCategoryMapper;
import com.xuecheng.content.service.CourseCategoryService;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.xuecheng.content.mapper")
public class CourseCategoryServiceTests {

    @Autowired
    CourseCategoryService courseCategoryService;
    @Test
    public void testCourseCategoryService() {

    }
}
