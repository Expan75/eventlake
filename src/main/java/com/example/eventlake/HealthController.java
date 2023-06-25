package com.example.eventlake;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthController {
    
    @RequestMapping(value = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map getString() {
        return Collections.singletonMap("message", "everything's fine");
    }
}