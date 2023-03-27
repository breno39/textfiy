package com.infotek.textify.ticket.application.api;

import com.infotek.textify.ticket.application.api.dto.TicketDto;
import com.infotek.textify.ticket.application.api.dto.TicketForm;
import com.infotek.textify.ticket.application.service.TicketService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Slf4j
@RestController
@AllArgsConstructor
public class TicketRestController implements TicketApi {
    private static final String TICKET_CREATE_PATH = "/app/user/v1/ticket/{ticketId}";
    private TicketService service;

    @Override
    public ResponseEntity<TicketDto> createTicket(TicketForm ticketForm, UriComponentsBuilder uriBuilder) {
        log.info("[TicketRestController] creating new ticket: {}", ticketForm);
        var createdTicket = service.createTicket(ticketForm.toEntity(), ticketForm.getAtendente().getNumeroDeContratoDeTrabalho());
        URI uri = uriBuilder.path(TICKET_CREATE_PATH)
                .buildAndExpand(createdTicket.getId()).toUri();
        log.info("[TicketRestController] created ticket with id: {}", createdTicket.getId());
        return ResponseEntity.created(uri).body(new TicketDto(createdTicket));
    }
}
