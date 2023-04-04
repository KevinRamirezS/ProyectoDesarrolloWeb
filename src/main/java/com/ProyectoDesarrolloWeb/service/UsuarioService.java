package com.ProyectoDesarrolloWeb.service;

import com.ProyectoDesarrolloWeb.domain.Usuario;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface UsuarioService {
    
    public List<Usuario> getUsuarios();
    
    public Usuario getUsuario(Usuario usuario);
    
    public void save(Usuario usuario);
    
    public void delete(Usuario usuario);
}
