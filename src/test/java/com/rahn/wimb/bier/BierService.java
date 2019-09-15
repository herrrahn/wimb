package com.rahn.wimb.bier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BierService {

    private final BierRepository bierRepository;

    @Autowired
    public BierService(BierRepository bierRepository) {
        this.bierRepository = bierRepository;
    }

    public Bier save(Bier b) {
        return this.bierRepository.save(b);
    }

    public List<Bier> findAll() {
        return this.bierRepository.findAll();
    }
}
