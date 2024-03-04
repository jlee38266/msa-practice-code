package com.ohgiraffers.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "헬로우!!";
    }
}
