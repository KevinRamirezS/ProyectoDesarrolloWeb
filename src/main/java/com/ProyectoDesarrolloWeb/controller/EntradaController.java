package com.ProyectoDesarrolloWeb.controller;

import com.ProyectoDesarrolloWeb.domain.CompraEntradas;
import com.ProyectoDesarrolloWeb.domain.Entrada;
import com.ProyectoDesarrolloWeb.service.CompraEntradasService;
import com.ProyectoDesarrolloWeb.service.EntradaService;
//import com.ProyectoDesarrolloWeb.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EntradaController {

    @Autowired
    EntradaService entradaService;
    
    @Autowired
    CompraEntradasService compraEntradasService;
    
    @GetMapping("/entradas/entradas")
    public String inicio(Model model) {
        var entradas = entradaService.getEntradas(false);
        model.addAttribute("entradas", entradas);
        return "/entradas/entradas";
    }
    @GetMapping("/entradas/compraentradas")
    public String inicio(Entrada entrada, Model model) {
        var compraEntradas = compraEntradasService.getCompraEntradas(false);
        model.addAttribute("compraEntradas", compraEntradas);
        return "/entradas/compraentradas";
    }

}
