package com.bibliography.stephen.controller;


import com.bibliography.stephen.entity.BiblioPojo;
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

    @PostMapping
    public String String (@RequestParam String typeName, @RequestParam String titleName, @RequestParam String observations, @RequestParam int bookYear, @RequestParam int pages){
        BiblioPojo biblioPojo = new BiblioPojo();
        biblioPojo.setTitleName(titleName);
        biblioPojo.setObservations(observations);
        biblioPojo.setYear(bookYear);
        biblioPojo.setPages(pages);
        return "Título: " + biblioPojo.getTitleName() + "\n" +
                "Ano Publicação: " + biblioPojo.getYear() + "\n" +
                "Páginas: " + biblioPojo.getPages() + "\n" +
                "Observações: " + biblioPojo.getObservations();

    }

}