package com.rahn.wimb.bier;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@CrossOrigin("*")
@RequestMapping("api/bier")
public class BierController {

    @GetMapping("/prost")
    public String prost() {
        return "prost...";
    }
}
