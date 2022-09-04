package com.blinkfox.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexController.
 *
 * @author chenjiayin02 on 2022-09-04.
 * @since 1.0.0
 */
@Slf4j
@RequestMapping
@RestController
public class IndexController {

    @GetMapping("/")
    public ResponseEntity<String> index() {
        String msg = "Hello World! Now time is: " + System.currentTimeMillis();
        log.info(msg);
        return ResponseEntity.ok(msg);
    }

}
