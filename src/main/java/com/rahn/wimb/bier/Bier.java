package com.rahn.wimb.bier;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Bier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    @Column(nullable = false)
    private String name;

    private BierType type;

    public Bier(UUID uuid, String name, BierType type) {
        this.uuid = uuid;
        this.name = name;
        this.type = type;
    }
}
