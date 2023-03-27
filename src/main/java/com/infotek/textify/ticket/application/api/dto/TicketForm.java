package com.infotek.textify.ticket.application.api.dto;

import com.infotek.textify.ticket.domain.Ticket;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
public class TicketForm implements Serializable {
    @NotEmpty
    String description;

    @NotNull
    EnderecoForm endereco;

    @NotNull
    AtendenteForm atendente;

    @NotNull
    ClienteForm cliente;

    public Ticket toEntity() {
        return Ticket.builder()
                .description(description)
                .endereco(endereco.toEntity())
                .cliente(cliente.toEntity())
                .build();
    }
}
