package com.ProyectoDesarrolloWeb.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author ADMIN
 */
@Data
@Entity
@Table(name = "entrada")
public class CompraEntradas implements Serializable{
    
    
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_entrada")
    private Long idEntrada;//Transforma en id_entrada
    private Long idCategoria;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private boolean activo;
    private String rutaImagen;

    public CompraEntradas() {
    }

    public CompraEntradas(Long idCategoria, String descripcion, String detalle, double precio, int existencias, boolean activo) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
    }
}
