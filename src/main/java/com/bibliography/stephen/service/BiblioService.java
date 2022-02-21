package com.bibliography.stephen.service;

import com.bibliography.stephen.repository.BiblioRepository;

import java.util.List;

public class BiblioService {

    private final BiblioRepository repository;

    public BiblioService(BiblioRepository repository){
        this.repository = repository;
    }

    public List<BiblioRepository> findAll(){
        return repository.findAll();
    }
}
