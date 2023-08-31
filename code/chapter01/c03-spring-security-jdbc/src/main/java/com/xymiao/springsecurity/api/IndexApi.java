package com.xymiao.springsecurity.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexApi {
    @GetMapping("")
    public String index(){
        return "index page";
    }

    @GetMapping("show")
    public String show(){
        return "show page";
    }
}
