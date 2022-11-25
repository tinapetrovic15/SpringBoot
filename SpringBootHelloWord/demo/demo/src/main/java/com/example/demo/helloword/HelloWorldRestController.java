package com.example.demo.helloword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/helloworld")
public class HelloWorldRestController {
    private final HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldRestController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
    @GetMapping
    public List<HelloWorld> getAll() { return helloWorldService.getAll(); }

    @GetMapping(path = "/hello-rest")
    public String getHelloWord() {
        return "Hello World";
    }

    @GetMapping(path = "/hello")
    public String getHelloWorldByLanguage(
            @RequestParam(required = true) String language) {
        return helloWorldService.getHelloWorldByLanguage(language);
    }

}
