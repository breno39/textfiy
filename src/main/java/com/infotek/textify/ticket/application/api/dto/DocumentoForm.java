package com.infotek.textify.ticket.application.api.dto;

import com.infotek.textify.cliente.domain.DocumentType;
import com.infotek.textify.cliente.domain.Documento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Base64;

@AllArgsConstructor
@Getter
@ToString
public class DocumentoForm implements Serializable {
    private final DocumentType type;
    private final String content;

    public Documento toEntity() {
        return Documento.builder()
                .type(type)
                .content(Base64.getDecoder().decode(content))
                .build();
    }
}
