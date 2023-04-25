package com.ProyectoDesarrolloWeb.service;

import com.ProyectoDesarrolloWeb.dao.CarritoDao;
import com.ProyectoDesarrolloWeb.domain.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoServiceImpl implements CarritoService {

    @Autowired
    CarritoDao carritoDao;

    @Override
    public Carrito getCarrito(Carrito carrito) {
        return carritoDao.findById(carrito.getIdCarrito()).orElse(null);
    }

    @Override
    public Carrito getCarritoUsuario(Long idUsuario) { //idUsuario = 3
        Carrito carritoUsuario=carritoDao.findByIdUsuario(idUsuario).orElse(null);
        //Evaludar si existe el carrito sino lo mandamos a crear
        if (carritoUsuario == null){
        Carrito carritoNuevo = new Carrito(idUsuario);//idCarrito = 0, idUsuario=3
        carritoUsuario = carritoDao.save(carritoNuevo);
        }
        return carritoUsuario;
    }

}
