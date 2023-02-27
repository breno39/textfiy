package com.infotek.textify.ticket.application.service;

import com.infotek.textify.ticket.domain.Ticket;
import org.springframework.stereotype.Service;

@Service
public interface TicketService {

    Ticket createTicket(Ticket ticket, long atendenteNumeroDeContrato);
}
