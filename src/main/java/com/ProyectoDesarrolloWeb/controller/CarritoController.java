package com.ProyectoDesarrolloWeb.controller;

import com.ProyectoDesarrolloWeb.domain.Entrada;
import com.ProyectoDesarrolloWeb.domain.CarritoDetalle;
import com.ProyectoDesarrolloWeb.service.EntradaService;
import com.ProyectoDesarrolloWeb.service.CarritoDetalleService;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CarritoController {

    @Autowired
    CarritoDetalleService carritoDetalleService;

    @Autowired
    EntradaService entradaService;

    @GetMapping("/carrito/agregar/{idEntrada}")
    public String agregar(Entrada entrada, HttpSession session) {
        
        Long idCarrito = (Long)session.getAttribute("idCarrito");
        entrada = entradaService.getEntrada(entrada);

        //Verificar si existe ya el entrada en el carrio
        CarritoDetalle carritoDetalle = carritoDetalleService.getCarritoDetalleEntrada(idCarrito, entrada);
        
        if (carritoDetalle != null) {
            carritoDetalle.setCantidad(carritoDetalle.getCantidad() + 1);
        } else {
            carritoDetalle = new CarritoDetalle(idCarrito, entrada, entrada.getPrecio(), 1);
        }
        carritoDetalleService.save(carritoDetalle);

        return "redirect:/";
    }

    @GetMapping("carrito/listado")
    public String listado(Model model, Entrada entrada, HttpSession session) {
        Long idCarrito = (Long)session.getAttribute("idCarrito");
        
        List<CarritoDetalle> carritoDetalles = carritoDetalleService.getCarritoDetalles(idCarrito);

        double montoTotal = 0.0;
        double montoImpuestos = 0.0;

        for (CarritoDetalle c : carritoDetalles) {
            montoTotal += c.getCantidad() * c.getPrecio();
        }
        montoImpuestos = montoTotal * 0.13;

        model.addAttribute("carritoDetalles", carritoDetalles);
        model.addAttribute("cantidadEntradasCarrito", carritoDetalles.size());
        model.addAttribute("montoImpuestos", montoImpuestos);
        model.addAttribute("montoTotal", montoTotal);

        return "/carrito/listado";
    }

}
