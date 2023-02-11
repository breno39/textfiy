package com.infotek.textify.credenciado.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "atendente")
public class Atendente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}