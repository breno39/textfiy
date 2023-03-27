package com.infotek.textify.ticket.application.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.infotek.textify.ticket.domain.Ticket;
import com.infotek.textify.ticket.domain.TicketStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class TicketDto implements Serializable {

    private Long id;
    private TicketStatus status;
    private LocalDateTime createdAt;

    public TicketDto(Ticket ticket) {
        this(ticket.getId(), ticket.getStatus(), ticket.getCreatedAt().toLocalDateTime());
    }
}
