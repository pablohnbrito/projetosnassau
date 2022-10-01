package Ex_18_Orientacao_Objetos;

import java.util.ArrayList;
import java.util.List;

public class Endereco {
	
	private String rua;
	private int numero;
	private String cep;
	private String complemento; 
	private int telefone;
	private String cidade;
	private String bairro; 
	
	List<Pessoa> pessoas = new ArrayList<Pessoa>();
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	public Endereco() {
		
	}

	public Endereco(String rua, int numero, String cep, String complemento, int telefone, String cidade,
			String bairro) {
		
		super();
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.complemento = complemento;
		this.telefone = telefone;
		this.cidade = cidade;
		this.bairro = bairro;
		
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		
		return numero;
	}

	public void setNumero(int numero) {
		
		this.numero = numero;
	}

	public String getCep() {
		
		return cep;
	}

	public void setCep(String cep) {
		
		this.cep = cep;
	}

	public String getComplemento() {
		
		return complemento;
	}

	public void setComplemento(String complemento) {
		
		this.complemento = complemento;
	}

	public int getTelefone() {
		
		return telefone;
	}

	public void setTelefone(int telefone) {
		
		this.telefone = telefone;
	}

	public String getCidade() {
		
		return cidade;
	}

	public void setCidade(String cidade) {
		
		this.cidade = cidade;
	}

	public String getBairro() {
		
		return bairro;
	}

	public void setBairro(String bairro) {
		
		this.bairro = bairro;
	}
}
