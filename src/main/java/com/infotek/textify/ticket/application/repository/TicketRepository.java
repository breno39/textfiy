package com.infotek.textify.ticket.application.repository;

import com.infotek.textify.ticket.domain.Ticket;

public interface TicketRepository {
    Ticket createTicket(Ticket ticket);
}
