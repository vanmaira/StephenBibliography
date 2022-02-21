package com.bibliography.stephen.controller;


import com.bibliography.stephen.repository.BiblioRepository;
import com.bibliography.stephen.service.BiblioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bibliography")
public class BiblioController {

    @Autowired
    private BiblioRepository biblioRepository;

    private BiblioService biblioService;

    public BiblioController(BiblioService service) {
        this.biblioService = service;
    }

    @GetMapping
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<BiblioRepository> list(){
        return biblioService.findAll();
    }


}