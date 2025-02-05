package com.tuap.backend.dominio.entidades;

import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public class Cliente extends Usuario {
    private String codigoCliente;
    private Float peso;
    private Float altura;
    private int edad;
    private String objetivo;
    private String codigoUnico;

    public Cliente(String codigoCliente, Float peso, Float altura, int edad, String objetivo, String codigoUnico,
            String nombre, String apellido, String email, UUID id, String contraseña) {
        super(nombre, apellido, email, id, contraseña);
        this.codigoCliente = codigoCliente;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.objetivo = objetivo;
        this.codigoUnico = codigoUnico;
    }
    //Getters

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public Float getPeso() {
        return peso;
    }

    public Float getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    //Setters

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    
}
