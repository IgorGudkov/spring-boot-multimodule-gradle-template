package com.gudkov.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/demo")
public class DemoController {

    @GetMapping(value = "/greeting")
    public String helloFromDemo(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }
}
