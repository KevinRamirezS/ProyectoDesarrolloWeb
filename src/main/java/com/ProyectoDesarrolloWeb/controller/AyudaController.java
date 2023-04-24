package com.ProyectoDesarrolloWeb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AyudaController {

   /* @Autowired
    AyudaService ayudaService;*/

    @GetMapping("/general/ayuda")
    public String inicio(Model model) {
        return "/general/ayuda";
    }
}
