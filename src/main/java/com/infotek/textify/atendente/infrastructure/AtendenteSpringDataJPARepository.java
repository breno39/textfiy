package com.infotek.textify.atendente.infrastructure;

import com.infotek.textify.atendente.domain.Atendente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AtendenteSpringDataJPARepository extends JpaRepository<Atendente, UUID> {
    Optional<Atendente> findByNumeroDeContratoDeTrabalho(long numeroDeContratoDeTrabalho);
}