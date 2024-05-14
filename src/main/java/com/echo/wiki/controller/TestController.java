package com.echo.wiki.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ClassName: TestController
 * Package: IntelliJ IDEA
 * Description:
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    //@GetMapping("/hello")
    //@PostMapping
    //@PutMapping
    //@DeleteMapping
    //@RequestMapping(value = "/user/1", method = RequestMethod.GET)
    //@RequestMapping(value = "/user/1", method = RequestMethod.DELETE)
    public String hello() {
        return "Hello World";
    }


    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post, " + name;
    }
}
