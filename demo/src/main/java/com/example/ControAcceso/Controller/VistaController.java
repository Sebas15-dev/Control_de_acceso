package com.example.ControAcceso.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VistaController {

    @GetMapping("/acudientes")
    public String acudientes() {
        return "acudientes";
    }
}
    

