package com.echo.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


/**
 * ClassName: TestController
 * Package: IntelliJ IDEA
 * Description:
 */
@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;
    @RequestMapping("/hello")
    //@GetMapping("/hello")
    //@PostMapping
    //@PutMapping
    //@DeleteMapping
    //@RequestMapping(value = "/user/1", method = RequestMethod.GET)
    //@RequestMapping(value = "/user/1", method = RequestMethod.DELETE)
    public String hello() {
        return "Hello World!" + testHello;
    }


    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post, " + name;
    }
}
