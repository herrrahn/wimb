package com.rahn.wimb.bier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@CrossOrigin("*")
@RequestMapping("api/bier")
public class BierController {

    private final BierService bierService;

    @Autowired
    public BierController(BierService bierService) {
        this.bierService = bierService;
    }

    @GetMapping("/prost")
    public String prost() {
        return "prost...";
    }

    @GetMapping
    public List<Bier> findAll() { return this.bierService.findAll();}

    @PostMapping
    public Bier save(@RequestParam(value = "bier_name") String name,
                     @RequestParam(value = "bier_type") BierType type
    ){ return this.bierService.save(name, type);}
}
