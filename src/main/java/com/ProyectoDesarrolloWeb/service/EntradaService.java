package com.ProyectoDesarrolloWeb.service;

import com.ProyectoDesarrolloWeb.domain.Entrada;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface EntradaService {

    public List<Entrada> getEntradas(boolean activos);

    public Entrada getEntrada(Entrada entrada);

}
