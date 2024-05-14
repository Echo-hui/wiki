package com.echo.wiki.controller;

import org.springframework.web.bind.annotation.*;

/**
 * ClassName: TestController
 * Package: IntelliJ IDEA
 * Description:
 *
 * @Author wh
 * @Create 2024/5/14 22:48
 * @Version 1.0
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
}
