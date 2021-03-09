package de.simonhauck.demo.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ExampleController {

    @GetMapping("/")
    public HelloWorldDto greeting() {
        log.info("Hello world called");
        return new HelloWorldDto("TestMessageNew\");
    }
}
