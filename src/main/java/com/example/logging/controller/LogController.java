package com.example.logging.controller;

import com.example.logging.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;

    @GetMapping("/log")
    public void log() {
        logService.log();
    }
}
