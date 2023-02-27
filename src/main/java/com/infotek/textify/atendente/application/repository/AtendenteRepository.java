package com.infotek.textify.atendente.application.repository;

import com.infotek.textify.atendente.domain.Atendente;

import java.util.Optional;

public interface AtendenteRepository {
    Optional<Atendente> findAtendenteByNumeroDeContratoDeTrabalho(long numeroDeContratoDeTrabalho);
}
