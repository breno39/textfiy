package com.infotek.textify.ticket.application.api.dto;

import com.infotek.textify.cliente.domain.ContatoTelefonico;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
public class ContatoTelefonicoForm implements Serializable {
    @Size(max = 2, min = 2) @NotNull
    private String ddd;
    @Size(max = 9, min = 9) @NotNull
    private String numero;

    public ContatoTelefonico toEntity() {
        return new ContatoTelefonico(ddd, numero);
    }
}
