package com.boot.upload.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexController
 *
 * @author lizhifu
 * @date 2020/12/17
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public String helloWorld(){
        return "helloWorld";
    }
}
