package com.ProyectoDesarrolloWeb.service;

import com.ProyectoDesarrolloWeb.domain.Entrada;
import com.ProyectoDesarrolloWeb.domain.CarritoDetalle;
import java.util.List;

public interface CarritoDetalleService {

    public CarritoDetalle getCarritoDetalle(CarritoDetalle carritoDetalle);

    public CarritoDetalle getCarritoDetalleEntrada(Long idCarrito, Entrada entrada);

    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito);

    public void save(CarritoDetalle carritoDetalle);

    public void delete(CarritoDetalle carritoDetalle);

    public void deleteAll(Long idCarrito);

}
