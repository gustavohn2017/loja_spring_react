package br.com.reactStore.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reactStore.store.entity.Estado;

public interface EstadoRepository extends JpaRepository <Estado, Long> {
    
}
