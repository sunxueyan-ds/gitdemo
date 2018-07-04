package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunxueyan-ds
 * @Title: TestController
 * @ProjectName springbootserver
 * @Description: TODO
 * @date 2018/7/4 15:13
 */
@RestController
public class TestController {

    @RequestMapping("TestSpringBoot")
    public String TestSpringBoot(){
        return "Test for SpringBoot";
    }
}
