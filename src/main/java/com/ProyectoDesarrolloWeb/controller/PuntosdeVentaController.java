package com.ProyectoDesarrolloWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Usuario
 */

@Controller
public class PuntosdeVentaController {

    @GetMapping("/general/puntosdeventa")
    public String inicio(Model model) {
        return "/general/puntosdeventa";
    }
}
