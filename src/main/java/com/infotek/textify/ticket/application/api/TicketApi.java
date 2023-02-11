package com.infotek.textify.ticket.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("user/v1/ticket")
public interface TicketApi {

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    ResponseEntity<Object> createTicket(@RequestBody @Valid Object ticketForm,
                                   UriComponentsBuilder uriBuilder);
}
