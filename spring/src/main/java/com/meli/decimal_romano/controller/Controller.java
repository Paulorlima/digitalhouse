package com.meli.decimal_romano.controller;

import com.meli.decimal_romano.service.NumerosRomanos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/romano")
public class Controller {


    @GetMapping("/{decimal}")
    public String converteParaRomano(@PathVariable int decimal){
        return NumerosRomanos.converterEmRomanos(decimal);
    }

}
