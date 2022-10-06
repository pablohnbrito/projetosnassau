package lista2.com.NFE;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movimentos {
	
	private Date hora;
	private double valor;
	
	List<Caixa> caixas = new ArrayList<>();
	
	public Movimentos() {
		
		
	}

	public Date getHora() {
		
		return hora;
	}

	public void setHora(Date hora) {
		
		this.hora = hora;
	}

	public double getValor() {
		
		return valor;
	}

	public void setValor(double valor) {
		
		this.valor = valor;
	}
}
