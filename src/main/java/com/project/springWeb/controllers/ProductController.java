package com.project.springWeb.controllers;

import com.project.springWeb.models.ProductModel;
import com.project.springWeb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository acao;

    @GetMapping("/")
    public String telaInicial(){
        return "Hello World!";
    }

    @PostMapping("/api")
    public ProductModel cadastrar(@RequestBody ProductModel dados){
        return acao.save(dados);
    }

    @GetMapping("exibir")
    public Iterable<ProductModel> exibir(){
        return acao.findAll();
    }

    @GetMapping("exibir/{id}")
    public ProductModel selecionar(@PathVariable int id){
        return acao.findByid(id);
    }
}
