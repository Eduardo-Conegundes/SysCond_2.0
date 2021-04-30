package br.upe.syscond.dao;

import java.util.List;

import br.upe.syscond.models.Pessoa;

public interface InterfacePessoa {

    Pessoa salvar(Pessoa p) throws Exception;
    List<Pessoa> listar() throws Exception;
    Pessoa buscar(int id) throws Exception;
    Pessoa atualizar(Pessoa p) throws Exception;
    void deletar(int id) throws Exception;
    
}