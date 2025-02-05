package com.tuap.backend.dominio.entidades;
import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public class Administrador extends Usuario {

    private String nivelAcceso;

    public Administrador(String nombre, String apellido, String email, UUID id, String contraseña, String nivelAcceso) {
        super(nombre, apellido, email, id, contraseña);
        this.nivelAcceso = nivelAcceso;
    }
    
    //Getters
    public String getNivelAcceso() {
        return nivelAcceso;
    }

    //Setters
    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
}
