package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class RestAPI {

    @GetMapping
    public Object get() {
        HashMap m = new HashMap();
        m.put("message", "Hello guy");
        return m;
    }
}
