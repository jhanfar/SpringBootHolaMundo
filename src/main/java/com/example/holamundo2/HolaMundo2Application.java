package com.example.holamundo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class HolaMundo2Application {

    public static void main(String[] args) {
        SpringApplication.run(HolaMundo2Application.class, args);
    }

}
@RestController
@RequestMapping("/pruebas")
 class Prueba1Controller {

    @RequestMapping(value = "print")
    public String prueba1(){
        String variable ="hola Mundo";
        return  variable;
    }
}