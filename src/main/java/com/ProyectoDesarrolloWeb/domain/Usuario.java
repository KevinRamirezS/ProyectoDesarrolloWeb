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
@Table(name="usuario")
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    String nombre;
    String telefono;
    String correo;
    
    @JoinColumn(name="id_tarjeta", referencedColumnName = "id_tarjeta")
    @ManyToOne
    private Tarjeta tarjeta;
    
    public Usuario(){
    }

    public Usuario(Long idUsuario, String nombre, String telefono, String correo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    
}
