package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bangunruang")
public class BangunRuang {

    @RequestMapping(value = {"/",""}, method = RequestMethod.GET)
    public String index(){
        return "bangunruang/index";
    }
    @RequestMapping(value = {"segitiga","segitiga"}, method = RequestMethod.GET)
    public String segitiga(){
        return "bangunruang/segitiga";
    }
}
