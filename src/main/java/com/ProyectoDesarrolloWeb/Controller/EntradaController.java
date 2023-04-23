package com.ProyectoDesarrolloWeb.Controller;

import com.ProyectoDesarrolloWeb.domain.Entrada;
import com.ProyectoDesarrolloWeb.service.EntradaService;
//import com.ProyectoDesarrolloWeb.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Usuario
 */
@Controller
public class EntradaController {

    @Autowired
    EntradaService entradaService;

    @Autowired
    //CategoriaService categoriaService;

    @GetMapping("/entrada/listado")
    public String inicio(Model model) {
        var entradas = entradaService.getEntradas(false);
        model.addAttribute("entradas", entradas);
        return "/entrada/listado";
    }

}
