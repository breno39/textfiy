package com.infotek.textify.sap.application.service;

import com.infotek.textify.sap.infrastructure.SapClient;
import com.infotek.textify.ticket.domain.Ticket;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
@NoArgsConstructor
public class SapTicketService implements SapService {
    private SapClient client;
    @Override
    public Long create(Ticket ticket) {
        log.info("creating ticket of ID: {} in SAP", ticket.getId());

        log.info("created SAP ticket of ID: {}", ticket.getId());
        return null;
    }
}
