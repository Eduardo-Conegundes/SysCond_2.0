/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Interface;

import Models.Locacao;
import java.util.List;

/**
 *
 * @author flavi
 */
public interface InterfaceLocacao {
    
    void salvar(Locacao l) throws Exception;
    List<Locacao> listar() throws Exception;
    Locacao listarId(int id) throws Exception;
    void atualizar(Locacao l) throws Exception;
    void deletar(Locacao l) throws Exception;
    
}
