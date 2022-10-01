package Ex_18_Orientacao_Objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PagamentoNFE {
	
	private double valor; 
	private Date dataPagamento; 
	
	List<Pedido> pedidos = new ArrayList<Pedido>();
	
	public PagamentoNFE() {
		
	}

	public PagamentoNFE(double valor, Date dataPagamento) {
		
		super();
		this.valor = valor;
		this.dataPagamento = dataPagamento;
	}

	public double getValor() {
		
		return valor;
	}

	public void setValor(double valor) {
		
		this.valor = valor;
	}

	public Date getDataPagamento() {
		
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		
		this.dataPagamento = dataPagamento;
	}
	
	public void efetuarPagamento(Pedido pedido) throws ParseException {
		
		while(true) {
			
			if(pedidos.add(pedido) == true) {
				
				String dataPagamento = "19/08/2022";
				
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				Date dataFormatada = formato.parse(dataPagamento);
				
				pedido.setDataPedido(dataFormatada);
				pedido.setValorPedido(902.49);
				
				System.out.println("Pagamento Efetuado com sucesso, no valor de: " + pedido.getValorPedido());
				System.out.println("A Data do Pagamento foi realizada na seguinte data: " + pedido.getDataPedido());
				
			} else {
				
				System.out.println("Pagamento não efetuado");
			}
		}
	}
	
}
