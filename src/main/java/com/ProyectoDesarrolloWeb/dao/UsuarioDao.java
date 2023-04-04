package com.ProyectoDesarrolloWeb.dao;

import com.ProyectoDesarrolloWeb.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ADMIN
 */
public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    

}
