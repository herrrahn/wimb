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

    public Bier(String name, BierType type) {
        this.name = name;
        this.type = type;
    }

    public Bier() {}

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BierType getType() {
        return type;
    }

    public void setType(BierType type) {
        this.type = type;
    }
}
