package br.com.reactStore.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reactStore.store.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
