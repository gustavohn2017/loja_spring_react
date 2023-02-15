package br.com.reactStore.store.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reactStore.store.entity.Categoria;
import br.com.reactStore.store.repository.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodos(){
        return categoriaRepository.findAll();
    };

    public Categoria inserir(Categoria categoria){
         categoria.setDataCriacao(new Date());
         Categoria categoriaNova= categoriaRepository.saveAndFlush(categoria);
         return categoriaNova;
    };

    public Categoria alterar(Categoria categoria){
        categoria.setDataCriacao(new Date());
        Categoria categoriaNova= categoriaRepository.saveAndFlush(categoria);
        return categoriaNova;
   };
   public void excluir(Long Id){
    Categoria categoria = categoriaRepository.findById(Id).get();
    categoriaRepository.delete(categoria);    


   };


    
}
