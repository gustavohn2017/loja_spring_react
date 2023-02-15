package br.com.reactStore.store.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reactStore.store.entity.Estado;
import br.com.reactStore.store.repository.EstadoRepository;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> buscarTodos(){
        return estadoRepository.findAll();

    };

    public Estado inserir(Estado estado){
        estado.setDataCriacao(new Date());
        Estado estadoNovo = estadoRepository.saveAndFlush(estado);
        return estadoNovo;

    };
    public Estado alterar(Estado estado){
        estado.setDataAtualizacao(new Date());
        Estado estadoNovo = estadoRepository.saveAndFlush(estado);
        return estadoNovo;
    };
    public void excluir(Long Id){
        Estado estado = estadoRepository.findById(Id).get();
        estadoRepository.delete(estado);


    };
}
