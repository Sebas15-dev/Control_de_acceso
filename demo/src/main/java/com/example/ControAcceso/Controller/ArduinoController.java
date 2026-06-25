package com.example.ControAcceso.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ControAcceso.Service.ArduinoService;

@RestController
@RequestMapping("/arduino")
public class ArduinoController {

    @Autowired
    private ArduinoService arduinoService;

    @GetMapping("/led/{estado}")
    public ResponseEntity<String> controlarLed(@PathVariable String estado) {
        String resultado = arduinoService.enviarComando(estado.toUpperCase());
        return ResponseEntity.ok(resultado);
    }
}