package com.ProyectoDesarrolloWeb.dao;

import com.ProyectoDesarrolloWeb.domain.Entrada;
import com.ProyectoDesarrolloWeb.domain.CarritoDetalle;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface CarritoDetalleDao extends CrudRepository<CarritoDetalle, Long>{
   List <CarritoDetalle> findByIdCarrito(Long idCarrito);
   CarritoDetalle findByIdCarritoAndEntrada(Long idCarrito, Entrada entrada);
   void deleteByIdCarrito(Long idCarrito);
}
