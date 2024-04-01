package dev.pollito.microserviceb.controller;

import dev.pollito.microserviceb.api.DefaultApi;
import dev.pollito.microserviceb.models.HelloWorld;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController implements DefaultApi {
  @Override
  public ResponseEntity<HelloWorld> helloWorld() {
    return ResponseEntity.ok(new HelloWorld().content("Hello world from microservice B"));
  }
}
