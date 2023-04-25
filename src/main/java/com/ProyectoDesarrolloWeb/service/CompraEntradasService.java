package com.ProyectoDesarrolloWeb.service;

import com.ProyectoDesarrolloWeb.domain.CompraEntradas;
import java.util.List;

public interface CompraEntradasService {
    
    public List<CompraEntradas> getCompraEntradas(boolean activos);
    
    public CompraEntradas getCompraEntradas(CompraEntradas compraEntradas);
}
