package Ex_15_Orientacao_Objetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Juridica {
	
	private String cnpj; 
	private String inscricaoEstadual;
	private Date fundacao;
	
	List<Pessoa> pessoas = new ArrayList<>();
	
	public Juridica() {
		
		
	}

	public Juridica(String cnpj, String inscricaoEstadual, Date fundacao) {
		super();
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.fundacao = fundacao;
	}

	public String getCnpj() {
		
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public Date getFundacao() {
		
		return fundacao;
	}

	public void setFundacao(Date fundacao) {
		
		this.fundacao = fundacao;
	}
	
	
}
