package com.ProyectoDesarrolloWeb.service;

import com.ProyectoDesarrolloWeb.domain.Carrito;

public interface CarritoService {

    public Carrito getCarrito(Carrito carrito);

    public Carrito getCarritoUsuario(Long idUsuario);
}
