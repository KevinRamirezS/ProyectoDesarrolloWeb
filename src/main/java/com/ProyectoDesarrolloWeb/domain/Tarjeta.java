package com.ProyectoDesarrolloWeb.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author ADMIN
 */
@Data
@Entity
@Table(name="tarjeta")
public class Tarjeta implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tarjeta")
    private Long idTarjeta;
    private double limite;
    
    public Tarjeta(){
    }
    
    public Tarjeta(double limite){
        this.limite = limite;
    }
}
