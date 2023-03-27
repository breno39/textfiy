package com.infotek.textify.atendente.infrastructure;

import com.infotek.textify.atendente.application.repository.AtendenteRepository;
import com.infotek.textify.atendente.domain.Atendente;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@AllArgsConstructor
@Component
public class AtendenteJpaRepository implements AtendenteRepository {
    private AtendenteSpringDataJPARepository repository;

    @Override
    public Optional<Atendente> findAtendenteByNumeroDeContratoDeTrabalho(long numeroDeContratoDeTrabalho) {
        return repository.findByNumeroDeContratoDeTrabalho(numeroDeContratoDeTrabalho);
    }
}
