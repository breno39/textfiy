package com.infotek.textify.atendente.application.service;

import com.infotek.textify.atendente.domain.Atendente;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AtendenteService {
    Optional<Atendente> findAtendenteByNumeroDeContratoDeTrabalho(long atendenteNumeroDeContratoDeTrabalho);
}
