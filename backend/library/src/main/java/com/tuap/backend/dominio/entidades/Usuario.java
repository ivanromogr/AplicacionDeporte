package com.tuap.backend.dominio.entidades;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    private String nombre;
    private String apellido;
    private String email;
    private UUID id;
    private String contraseña;


    public Usuario(String nombre, String apellido, String email, UUID id, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.id = id;
        this.contraseña = contraseña;
    }
 //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //Id

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    //Contraseña
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


}
