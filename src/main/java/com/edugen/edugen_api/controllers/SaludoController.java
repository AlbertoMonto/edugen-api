package com.edugen.edugen_api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class SaludoController {

    @GetMapping("/saludo")
    
    public String info(Model model){
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor", "Bienvenido al servidor");
        

        return "saludo";
    }

}
