package com.infotek.textify.ticket.application.service;

import com.infotek.textify.atendente.application.service.AtendenteService;
import com.infotek.textify.ticket.application.repository.TicketRepository;
import com.infotek.textify.ticket.domain.Ticket;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class TicketSpringDataJpaService implements TicketService {

    private AtendenteService atendenteService;

    private TicketRepository ticketRepository;
    @Override
    public Ticket createTicket(Ticket ticket, long atendenteNumeroDeContratoDeTrabalho) {
        log.info("[TicketSpringDataJpaService] creating new ticket for atendente: {}", atendenteNumeroDeContratoDeTrabalho);
        var returnedAtendente = atendenteService.findAtendenteByNumeroDeContratoDeTrabalho(atendenteNumeroDeContratoDeTrabalho)
                .orElseThrow();
        ticket.setAtendente(returnedAtendente);
        ticket = ticketRepository.createTicket(ticket);
        log.info("[TicketSpringDataJpaService] created new ticket of id: {} for atendente: {}", ticket.getId(), atendenteNumeroDeContratoDeTrabalho);
        return ticket;
    }
}
