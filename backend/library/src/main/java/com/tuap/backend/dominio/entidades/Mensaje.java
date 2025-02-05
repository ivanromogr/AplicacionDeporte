package com.tuap.backend.dominio.entidades;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mensaje {
    @Id
    private UUID id;
    private UUID chatid;
    private UUID remitenteid;
    private String contenido;
    private Date timestamp;

    public Mensaje(UUID id, UUID chatid, UUID remitenteid, String contenido, Date timestamp) {
        this.id = id;
        this.chatid = chatid;
        this.remitenteid = remitenteid;
        this.contenido = contenido;
        this.timestamp = timestamp;
    }


    //Getters
    public UUID getId() {
        return id;
    }

    public UUID getChatid() {
        return chatid;
    }

    public UUID getRemitenteid() {
        return remitenteid;
    }

    public String getContenido() {
        return contenido;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    //Setters

    public void setId(UUID id) {
        this.id = id;
    }

    public void setChatid(UUID chatid) {
        this.chatid = chatid;
    }

    public void setRemitenteid(UUID remitenteid) {
        this.remitenteid = remitenteid;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    
}
