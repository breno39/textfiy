package com.infotek.textify.ticket.infrastructure;

import com.infotek.textify.ticket.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketJpaRepository extends JpaRepository<Ticket, Long> {
}