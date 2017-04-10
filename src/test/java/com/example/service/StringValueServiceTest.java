package com.example.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by zc.lin on 2017/4/7.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StringValueServiceTest {

    @Resource
    StringValueService stringValueService;

    @Test
    public void init() throws Exception {
        this.stringValueService.init();
    }

}