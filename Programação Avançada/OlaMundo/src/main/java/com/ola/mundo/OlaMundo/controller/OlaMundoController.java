package com.ola.mundo.OlaMundo.controller;

import com.ola.mundo.OlaMundo.model.OlaMundo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {

    @GetMapping("/ola")
    public OlaMundo sayHello(
            @RequestParam(value="id", defaultValue = "0") int id,
            @RequestParam(value="message", defaultValue = "") String message) {
         return new OlaMundo(id, message);
    }
}
