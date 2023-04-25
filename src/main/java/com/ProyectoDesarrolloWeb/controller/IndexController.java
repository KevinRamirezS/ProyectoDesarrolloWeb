package com.ProyectoDesarrolloWeb.controller;

import com.ProyectoDesarrolloWeb.domain.Usuario;
import com.ProyectoDesarrolloWeb.service.CarritoDetalleService;
import com.ProyectoDesarrolloWeb.service.CarritoService;
import com.ProyectoDesarrolloWeb.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ADMIN
 */
@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @Autowired
    CarritoService carritoService;
    
    @Autowired
    CarritoDetalleService carritoDetalleService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando MVC");
        
        //var usuarios = usuariosDao.findAll();
        var usuarios= usuarioService.getUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "index";
    }
    
    @GetMapping("/nuevoUsuario")
    public String nuevoUsuario(Usuario usuario){
        return "modificarUsuario";
    }
    
    @PostMapping("/guardarUsuario")
    public String guardarUsuario(Usuario usuario){
        usuarioService.save(usuario);
        return "redirect:/";
    }
    
    @GetMapping("/eliminarUsuario/{idUsuario}")
    public String eliminarUsuario(Usuario usuario){
        usuarioService.delete(usuario);
        return "redirect:/";
    }
}
