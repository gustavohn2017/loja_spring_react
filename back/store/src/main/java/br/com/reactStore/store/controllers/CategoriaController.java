package br.com.reactStore.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.reactStore.store.entity.Categoria;
import br.com.reactStore.store.service.CategoriaService;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {
    @Autowired
    CategoriaService categoriaService;
    
    @GetMapping("/")
    public List <Categoria> buscarTodos(){
        return categoriaService.buscarTodos();

    };
    @PostMapping("/")
    public Categoria inserir(@RequestBody Categoria categoria ){
        return categoriaService.inserir(categoria);

    };
    @PutMapping("/")
    public Categoria alterar(@RequestBody Categoria categoria ){
        return categoriaService.alterar(categoria);
    };
    @DeleteMapping("/{Id}")
    public ResponseEntity<Void> excluir(@PathVariable("Id") Long Id){
        categoriaService.excluir(Id);
        return ResponseEntity.ok().build();

    }


    
}
