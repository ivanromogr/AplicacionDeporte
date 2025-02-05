package com.tuap.backend.dominio.entidades;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Entrenamiento {
    @Id
    private UUID id;
    private String titulo;
    private UUID entrenadorId;
    private UUID clienteId;
    private String descripcion;

    
    public Entrenamiento(UUID id, String titulo, UUID entrenadorId, UUID clienteId, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.entrenadorId = entrenadorId;
        this.clienteId = clienteId;
        this.descripcion = descripcion;
    }

    //Getters

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public UUID getEntrenadorId() {
        return entrenadorId;
    }

    public UUID getClienteId() {
        return clienteId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //Setters

    public void setId(UUID id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEntrenadorId(UUID entrenadorId) {
        this.entrenadorId = entrenadorId;
    }

    public void setClienteId(UUID clienteId) {
        this.clienteId = clienteId;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
