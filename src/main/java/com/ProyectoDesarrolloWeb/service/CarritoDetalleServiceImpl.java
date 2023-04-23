package com.ProyectoDesarrolloWeb.service;

import com.ProyectoDesarrolloWeb.dao.CarritoDetalleDao;
import com.ProyectoDesarrolloWeb.domain.Entrada;
import com.ProyectoDesarrolloWeb.domain.CarritoDetalle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class CarritoDetalleServiceImpl implements CarritoDetalleService {

    @Autowired
    CarritoDetalleDao carritoDetalleDao;

    @Override
    public CarritoDetalle getCarritoDetalle(CarritoDetalle carritoDetalle) {
        return carritoDetalleDao.findById(carritoDetalle.getIdCarrito()).orElse(null);
    }

    @Override
    public CarritoDetalle getCarritoDetalleEntrada(Long idCarrito, Entrada entrada) {
        return carritoDetalleDao.findByIdCarritoAndEntrada(idCarrito, entrada);
    }

    @Override
    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito) {
        return carritoDetalleDao.findByIdCarrito(idCarrito);
    }

    @Override
    public void save(CarritoDetalle carritoDetalle) {
        carritoDetalleDao.save(carritoDetalle);
    }

    @Override
    public void delete(CarritoDetalle carritoDetalle) {
        carritoDetalleDao.deleteById(carritoDetalle.getIdDetalle());
    }

    @Override
    public void deleteAll(Long idCarrito) {
        carritoDetalleDao.deleteByIdCarrito(idCarrito);
    }

}
