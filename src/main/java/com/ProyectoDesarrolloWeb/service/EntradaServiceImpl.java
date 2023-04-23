package com.ProyectoDesarrolloWeb.service;

import com.ProyectoDesarrolloWeb.dao.EntradaDao;
import com.ProyectoDesarrolloWeb.domain.Entrada;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EntradaServiceImpl implements EntradaService {

    @Autowired
    EntradaDao entradaDao;

    @Override
    @Transactional(readOnly = true)//Para manejar transacciones de solo lectura
    public List<Entrada> getEntradas(boolean activos) {
        var lista = (List<Entrada>) entradaDao.findAll();
        return lista;

    }

    @Override
    @Transactional(readOnly = true)//Para manejar transacciones de solo lectura
    public Entrada getEntrada(Entrada entrada) {
        return entradaDao.findById(entrada.getIdEntrada()).orElse(null);
    }

}

