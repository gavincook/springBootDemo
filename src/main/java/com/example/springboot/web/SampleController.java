package com.example.springboot.web;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author GavinCook
 * @date 2015/10/29
 */
@Controller
public class SampleController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return jdbcTemplate.query("select id from tab_user limit 1", handler->{
            handler.next();
            return handler.getInt(1)+"";
        });
    }

}