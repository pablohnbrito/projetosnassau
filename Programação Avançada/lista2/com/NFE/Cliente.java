package Ex_18_Orientacao_Objetos;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String nomeUsuario;
	private String cargo; 
	private double salario;
	private boolean status;
	private String senha;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String cpf, String nomeUsuario, String cargo, double salario, boolean status,
			String senha) {
		
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nomeUsuario = nomeUsuario;
		this.cargo = cargo;
		this.salario = salario;
		this.status = status;
		this.senha = senha;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getCpf() {
		
		return cpf;
	}

	public void setCpf(String cpf) {
		
		this.cpf = cpf;
	}

	public String getNomeUsuario() {
		
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		
		this.nomeUsuario = nomeUsuario;
	}

	public String getCargo() {
		
		return cargo;
	}

	public void setCargo(String cargo) {
		
		this.cargo = cargo;
	}

	public double getSalario() {
		
		return salario;
	}

	public void setSalario(double salario) {
		
		this.salario = salario;
	}

	public boolean isStatus() {
		
		return status;
	}

	public void setStatus(boolean status) {
		
		this.status = status;
	}

	public String getSenha() {
		
		return senha;
	}

	public void setSenha(String senha) {
		
		this.senha = senha;
	}
	
}
