package com.crunchify.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class GetCategories {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping("/GetCategories")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello";
    }
}
