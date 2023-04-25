package com.ProyectoDesarrolloWeb.dao;

import com.ProyectoDesarrolloWeb.domain.Carrito;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface CarritoDao extends CrudRepository<Carrito, Long> {
   Optional <Carrito> findByIdUsuario(Long idUsuario);
}
