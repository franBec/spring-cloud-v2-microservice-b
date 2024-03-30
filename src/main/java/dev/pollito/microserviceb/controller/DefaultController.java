package dev.pollito.microserviceb.controller;

import dev.pollito.microserviceb.api.DefaultApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController implements DefaultApi {
    @Override
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World from Microservice B");
    }
}
