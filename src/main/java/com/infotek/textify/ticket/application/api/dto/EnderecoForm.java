package com.infotek.textify.ticket.application.api.dto;

import com.infotek.textify.ticket.domain.Endereco;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
public class EnderecoForm implements Serializable {
    @Size(max = 8, min = 8) @NotEmpty String cep;
    @Size(max = 1, min = 4) @NotEmpty String numero;
    @Size @NotEmpty String rua;
    @NotEmpty String bairro;
    @NotEmpty String municipio;
    @Size(max = 1000) String complemento;

    public Endereco toEntity() {
        return new Endereco(cep, numero, rua, bairro, municipio, complemento);
    }
}
