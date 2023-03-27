package com.infotek.textify.atendente.application.service;

import com.infotek.textify.atendente.application.repository.AtendenteRepository;
import com.infotek.textify.atendente.domain.Atendente;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AtendenteMockService implements AtendenteService {

    private AtendenteRepository repository;
    @Override
    public Optional<Atendente> findAtendenteByNumeroDeContratoDeTrabalho(long numeroDeContratoDeTrabalho) {
        return repository.findAtendenteByNumeroDeContratoDeTrabalho(numeroDeContratoDeTrabalho);
    }
}
