package com.example.springboothelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    private Map<String, Object> result = new HashMap<>();

    @RequestMapping("/hello")
    public Map<String, Object> hello() {

        result.put("Name", "Divyansh");
        result.put("City", "San Fransisco");
        return result;

    }

}
