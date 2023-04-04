package com.ProyectoDesarrolloWeb.service;

import com.ProyectoDesarrolloWeb.dao.TarjetaDao;
import com.ProyectoDesarrolloWeb.dao.UsuarioDao;
import com.ProyectoDesarrolloWeb.domain.Tarjeta;
import com.ProyectoDesarrolloWeb.domain.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ADMIN
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioDao usuarioDao;

    @Autowired
    TarjetaDao tarjetaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Usuario> getUsuarios() {
        return(List<Usuario>)usuarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario getUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Usuario usuario) {
        Tarjeta tarjeta = usuario.getTarjeta();
        tarjeta = tarjetaDao.save(tarjeta);
        
        usuario.setTarjeta(tarjeta);
        usuarioDao.save(usuario);
    }
    
    @Override
    @Transactional
    public void delete(Usuario usuario) {
        usuarioDao.deleteById(usuario.getIdUsuario());
    }
    
    
}
