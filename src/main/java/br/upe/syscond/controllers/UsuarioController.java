package br.upe.syscond.controllers;

import java.util.List;

import br.upe.syscond.dao.UsuarioDAO;
import br.upe.syscond.models.Usuario;

public class UsuarioController implements InterfaceUsuarioController{

	public Usuario criar(Usuario user){
		
		if(this.buscar(user) != null) {
			return null;
		}

		try {
			return UsuarioDAO.getInstance().salvar(user);
		} catch (Exception eSalvar) {
			System.err.println("Erro ao salvar usu�rio!");
			return null;
		}

	}

	public List<Usuario> listar(){
		try {
			List<Usuario> users = UsuarioDAO.getInstance().listar();
			return users;
		} catch (Exception eListar) {
			System.err.println("Erro ao listar usu�rio(s)!");
			return null;
		}
	}

	public Usuario buscar(Usuario user){
		List<Usuario> users = this.listar();

		for (Usuario user2 : users) {
			if(user2.equals(user)) {
				return user2;				
			}
		}
		return null;
	}

	public Usuario atualizar(Usuario antigo, Usuario novo){
		try {
			novo.setId(this.buscar(antigo).getId());
			return UsuarioDAO.getInstance().atualizar(novo);
		} catch (Exception eBuscar) {
			System.err.println("Erro ao buscar usu�rio!");
			return null;
		}
	}

	public boolean deletar(Usuario user){
		int id = this.buscar(user).getId();
		try {
			UsuarioDAO.getInstance().deletar(id);
			return true;
		} catch (Exception e) {
			System.err.println("Erro ao excluir Usuario!");
			return true;
		}
	}
}
