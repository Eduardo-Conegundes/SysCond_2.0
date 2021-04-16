package DAO.Interface;

import Models.Pessoa;
import java.util.List;

public interface InterfacePessoa {

    Pessoa salvar(Pessoa p) throws Exception;
    List<Pessoa> listar() throws Exception;
    Pessoa buscar(String cpf) throws Exception;
    Pessoa atualizar(Pessoa p) throws Exception;
    void deletar(String cpf) throws Exception;
    
}