package com.tuap.backend.dominio.entidades;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Chat {
    @Id
    private UUID id;
    private UUID clienteid;
    private UUID entrenadorid;

    public Chat(UUID id, UUID clienteid, UUID entrenadorid) {
        this.id = id;
        this.clienteid = clienteid;
        this.entrenadorid = entrenadorid;
    }

    //Getters  
    public UUID getId() {
        return id;
    }

    public UUID getClienteid() {
        return clienteid;
    }

    public UUID getEntrenadorid() {
        return entrenadorid;
    }

    //Setters

    public void setId(UUID id) {
        this.id = id;
    }

    public void setClienteid(UUID clienteid) {
        this.clienteid = clienteid;
    }

    public void setEntrenadorid(UUID entrenadorid) {
        this.entrenadorid = entrenadorid;
    }

    
}
