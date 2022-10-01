package Ex_18_Orientacao_Objetos;

import java.util.ArrayList;
import java.util.List;

public class Gerente {
	
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public Gerente() {
		
	}
	
	public void criarFuncionario(Pessoa pessoa) {
		
		if(pessoas.add(pessoa) == true) {
			
			System.out.println("Cadastro feito com sucesso");
			
		} else {
			
			System.out.println("Cadastro Invalido");
		}
	}
	
	public void listaFuncionario(Pessoa pessoa) {
		
		for(int i = 0; i < pessoas.size(); i++) {
			
			Pessoa pe = pessoas.get(i);
			
			System.out.println("Nome: " + pe.getNome());
			System.out.println("Cpf: " + pe.getCpf());
			System.out.println("Nome Usuario: " + pe.getNomeUsuario());
			System.out.println("Matricula: " + pe.getMatricula()); 
			System.out.println("Cargo: " + pe.getCargo());
			System.out.println("Salário: " + pe.getSalario());
			System.out.println("Senha: " + pe.getSenha());
		}
	}
	
	public void listaCliente(Cliente cliente) {
		
	
		for(int i = 0; i < pessoas.size(); i++) {
			
			Pessoa pe = pessoas.get(i);
			System.out.println("Nome: " + pe.getNome());
			System.out.println("Cpf: " + pe.getCpf());
			System.out.println("Nome Usuario: " + pe.getNomeUsuario());
			System.out.println("Matricula: " + pe.getMatricula()); 
			System.out.println("Cargo: " + pe.getCargo());
			System.out.println("Salário: " + pe.getSalario());
			System.out.println("Senha: " + pe.getSenha());
		}
	}
	
}
