package com.tuap.backend.dominio.entidades;

import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public class Entrenador extends Usuario {
    private String especialidad;
    private String codigoEntrenador;
    
    public Entrenador(String especialidad, String codigoEntrenador, String nombre, String apellido, String email,
     UUID id, String contraseña) {
        super(nombre, apellido, email, id, contraseña);
        this.especialidad = especialidad;
        this.codigoEntrenador = codigoEntrenador;
    }
    //Getters
    public String getEspecialidad() {
        return especialidad;
    }

    public String getCodigoEntrenador() {
        return codigoEntrenador;
    }

    //Setters
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setCodigoEntrenador(String codigoEntrenador) {
        this.codigoEntrenador = codigoEntrenador;
    }
}
