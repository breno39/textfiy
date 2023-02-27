package com.infotek.textify.ticket.domain;

import com.infotek.textify.cliente.domain.Cliente;
import com.infotek.textify.atendente.domain.Atendente;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Builder
@Entity
@Getter
@Table(name = "ticket")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Lob
    @Setter
    @Basic(fetch = FetchType.LAZY)
    private String description;

    @Setter
    @Enumerated
    @Builder.Default
    private TicketStatus status = TicketStatus.CREATED;

    @Embedded
    private Endereco endereco;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade={CascadeType.MERGE})
    @JoinColumn(name = "atendente_id")
    private Atendente atendente;

    @ManyToOne(fetch = FetchType.LAZY, cascade= {CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @CreationTimestamp
    private OffsetDateTime createdAt;

    @UpdateTimestamp
    private OffsetDateTime updatedAt;
}