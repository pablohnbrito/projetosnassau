package lista2.com.NFE;

import java.util.Date;

public class Caixa {
	
	private double valorReceita; 
	private Date dataAbertura; 
	private Date dataFechamento;

	public Caixa() {
		
		
	}

	public Caixa(double valorReceita, Date dataAbertura, Date dataFechamento) {
		
		super();
		this.valorReceita = valorReceita;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
		
	}

	public double getValorReceita() {
		
		return valorReceita;
	}

	public void setValorReceita(double valorReceita) {
		
		this.valorReceita = valorReceita;
	}

	public Date getDataAbertura() {
		
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		
		this.dataAbertura = dataAbertura;
	}

	public Date getDataFechamento() {
		
		return dataFechamento;
	}

	public void setDataFechamento(Date dataFechamento) {
		
		this.dataFechamento = dataFechamento;
	}
	
	
}
