package com.ProyectoDesarrolloWeb.domain;

import jakarta.persistence.*;
import lombok.Data;

/**
 *
 * @author Usuario
 */
@Data
@Entity
@Table(name = "entrada")
public class Entrada {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="id_entrada", referencedColumnName="id_entrada")
    private Long idEntrada;//Transforma en id_entrada
    private Long idCategoria;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;

    public Entrada() {
    }

    public Entrada(Long idCategoria, String descripcion, String detalle, double precio, int existencias, String rutaImagen) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
    }
}
