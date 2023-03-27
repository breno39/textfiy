package com.infotek.textify.ticket.infrastructure;

import com.infotek.textify.ticket.application.repository.TicketRepository;
import com.infotek.textify.ticket.domain.Ticket;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class TicketJPARepository implements TicketRepository {

    private TicketSpringDataJPARepository repository;

    @Override
    public Ticket createTicket(Ticket ticket) {
        log.info("[TicketJPARepository] saving new ticket");
        var savedTicket = repository.save(ticket);
        log.info("[TicketJPARepository] new ticket saved with id: {}", ticket.getId());
        return savedTicket;
    }
}
