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

    public Bier save(String name, BierType type) {
        return this.bierRepository.save(new Bier(name, type));
    }

    public List<Bier> findAll() {
        return this.bierRepository.findAll();
    }

}
