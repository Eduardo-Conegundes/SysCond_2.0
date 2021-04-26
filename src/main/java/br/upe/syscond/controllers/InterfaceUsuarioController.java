package br.upe.syscond.controllers;

import java.util.List;

import br.upe.syscond.models.Usuario;

public interface InterfaceUsuarioController {
	public Usuario criar(Usuario user);
	public List<Usuario> listar();
	public Usuario buscar(Usuario user);
	public Usuario atualizar(Usuario antigo, Usuario novo);
	public void deletar(int id);

}
