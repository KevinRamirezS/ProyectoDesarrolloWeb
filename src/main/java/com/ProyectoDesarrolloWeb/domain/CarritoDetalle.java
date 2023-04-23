package com.ProyectoDesarrolloWeb.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "carrito_detalle")
public class CarritoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;//Transforma en id_detalle
    private Long idCarrito;//Transforma en id_carrito
    
    @JoinColumn(name="id_entrada", referencedColumnName= "id_entrada")    
    @ManyToOne
    private Entrada entrada;
    private double precio;
    private int cantidad;

    public CarritoDetalle() {
    }

    public CarritoDetalle(Long idCarrito, Entrada entrada, double precio, int cantidad) {
        this.idCarrito = idCarrito;
        this.entrada = entrada;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    

}
