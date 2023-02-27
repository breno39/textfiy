package com.infotek.textify.cliente.domain;

import com.infotek.textify.ticket.domain.Ticket;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Set;
import java.util.UUID;

@Builder
@Entity
@Getter
@Table(name = "cliente")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Cliente {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(name = "id", nullable = false)
    private UUID id;

    private String nome;

    private String rg;

    private String cpf;

    private String email;

    @Embedded
    private ContatoTelefonico telefone;

    private LocalDateTime birthdayDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private Set<Ticket> tickets;

    @CreationTimestamp
    private OffsetDateTime createdAt;

    @UpdateTimestamp
    private OffsetDateTime updatedAt;
}