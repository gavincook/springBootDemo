package com.example.springboot.web;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author GavinCook
 * @since 1.0.0
 */
@Controller
public class SampleController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        int userCount = jdbcTemplate.queryForObject("select count(id) from tab_user",Integer.class);
        return "There have " + userCount+" user(s).";
    }

}