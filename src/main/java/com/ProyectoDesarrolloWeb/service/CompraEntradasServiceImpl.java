package com.ProyectoDesarrolloWeb.service;

import com.ProyectoDesarrolloWeb.dao.CompraEntradasDao;
import com.ProyectoDesarrolloWeb.domain.CompraEntradas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ADMIN
 */
@Service
public class CompraEntradasServiceImpl implements CompraEntradasService{
    
    @Autowired
    CompraEntradasDao compraEntradasDao;
    
    @Override
    @Transactional(readOnly = true)//Para manejar transacciones de solo lectura
    public List<CompraEntradas> getCompraEntradas(boolean activos) {
        var lista = (List<CompraEntradas>) compraEntradasDao.findAll();
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;

    }

    @Override
    @Transactional(readOnly = true)//Para manejar transacciones de solo lectura
    public CompraEntradas getCompraEntradas(CompraEntradas compraEntradas) {
        return compraEntradasDao.findById(compraEntradas.getIdEntrada()).orElse(null);
    }
}
