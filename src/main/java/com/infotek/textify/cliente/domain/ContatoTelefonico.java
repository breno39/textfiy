package com.infotek.textify.cliente.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ContatoTelefonico {
    private String ddd;

    private String numero;

    public String getFullNumber() {
        return ddd.concat(numero);
    }
}
