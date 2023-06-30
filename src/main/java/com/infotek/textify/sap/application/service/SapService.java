package com.infotek.textify.sap.application.service;

import com.infotek.textify.ticket.domain.Ticket;
import org.springframework.stereotype.Service;

@Service
public interface SapService {
    Long create(Ticket ticket);
}
