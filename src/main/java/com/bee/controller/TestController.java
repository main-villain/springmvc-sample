package com.bee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 项目名：springmvc-sample
 * 作者：汤竞祥
 * 日期：2016/11/11 19:33
 */

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/index")
    @ResponseBody
    public String index() {
        return "Hello World";
    }
}
