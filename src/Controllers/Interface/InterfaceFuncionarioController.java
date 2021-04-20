package Controllers.Interface;

import java.util.List;

import Models.Funcionario;

public interface InterfaceFuncionarioController {
	public Funcionario criar(Funcionario funcionario);
	public List<Funcionario> listar();
	public Funcionario buscar(String cpf);
	public Funcionario atualizar(Funcionario funcionario);
	public void deletar(String cpf);
}
