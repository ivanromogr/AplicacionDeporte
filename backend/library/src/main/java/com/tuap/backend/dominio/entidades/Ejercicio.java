package com.tuap.backend.dominio.entidades;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ejercicio {
    @Id
    private UUID id;
    private String nombre;
    private String descripcion;
    private Float peso;
    private int repeticiones;
    private int series;
    private String categoria;
    private int duracion;
    private String dificultad;
    private String enlaceAnimacion;
    private int descanso;

    public Ejercicio( UUID id, String nombre, String descripcion, Float peso, int repeticiones, int series,
     String categoria, int duracion, String dificultad, String enlaceAnimacion, int descanso) {   
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.repeticiones = repeticiones;
        this.series = series;
        this.categoria = categoria;
        this.duracion = duracion;
        this.dificultad = dificultad;
        this.enlaceAnimacion = enlaceAnimacion;
        this.descanso = descanso;
    }
    //Getters

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Float getPeso() {
        return peso;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public int getSeries() {
        return series;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getDificultad() {
        return dificultad;
    }

    public String getEnlaceAnimacion() {
        return enlaceAnimacion;
    }

    public int getDescanso() {
        return descanso;
    }


    //Setters
    public void setId(UUID id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public void setEnlaceAnimacion(String enlaceAnimacion) {
        this.enlaceAnimacion = enlaceAnimacion;
    }

    public void setDescanso(int descanso) {
        this.descanso = descanso;
    }

    

}
