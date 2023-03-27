package com.infotek.textify.ticket.application.api.dto;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
public class AtendenteForm implements Serializable {

    @NotNull
    long numeroDeContratoDeTrabalho;
}
