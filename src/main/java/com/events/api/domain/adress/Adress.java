package com.events.api.domain.adress;

import com.events.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

import java.util.UUID;


@Table(name= "adres")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Adress {
    @Id
    @GeneratedValue
    private UUID id;
    private String city;
    private String uf;

    @ManyToOne
    @JoinColumn(name="event_id")
    private Event event;

}
