package com.infotek.textify.atendente.domain;

import com.infotek.textify.ticket.domain.Ticket;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Builder
@Table(name = "atendente")
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Atendente {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(name = "id", nullable = false)
    private UUID id;

    private String nome;

    @Column(unique = true, updatable = false, nullable = false)
    private long numeroDeContratoDeTrabalho;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atendente")
    private Set<Ticket> tickets;

    @CreationTimestamp
    private OffsetDateTime createdAt;

    @UpdateTimestamp
    private OffsetDateTime updatedAt;

}