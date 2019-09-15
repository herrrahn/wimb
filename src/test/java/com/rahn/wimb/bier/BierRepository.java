package com.rahn.wimb.bier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BierRepository extends JpaRepository<Bier, UUID> {
}
