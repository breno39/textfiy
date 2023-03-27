package com.infotek.textify.ticket.application.api.dto;

import com.infotek.textify.cliente.domain.Cliente;
import lombok.Getter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
public class ClienteForm implements Serializable {
    @NotEmpty @Size(max = 500, min = 10)
    private String nome;
    @NotEmpty @Size()
    private String rg;
    @NotNull @CPF
    private String cpf;
    @NotNull @Email
    private String email;
    private ContatoTelefonicoForm telefone;
    @NotNull
    private LocalDateTime birthdayDate;

    public Cliente toEntity() {
        return Cliente.builder()
                .nome(nome)
                .rg(rg)
                .cpf(cpf)
                .email(email)
                .telefone(telefone.toEntity())
                .birthdayDate(birthdayDate)
                .build();
    }
}
