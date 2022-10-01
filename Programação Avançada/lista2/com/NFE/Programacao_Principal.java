package Ex_18_Orientacao_Objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Programacao_Principal {
	
	public static void main(String[] args) throws ParseException {
		
		Produto p = new Produto("Televisão", 45.65, 500.00, "Eletrônico");
		
		ItemPedido it = new ItemPedido(3, p);
		
		System.out.println(it); 
		
		Pedido pe = new Pedido();
		
		String dataPedido = "19/08/2022";
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = formato.parse(dataPedido);
		
		pe.setDataPedido(dataFormatada);
		pe.setStatus(true);
		pe.setValorPedido(1100.00);
		pe.setItempedido(it);
		
		System.out.println("\nData do Pedido: " + pe.getDataPedido());
		System.out.println("Status: " + pe.isStatus()); 
		System.out.println("Valor do Pedido: " + pe.getValorPedido());
		System.out.println("Item do Pedido: " + pe.getItempedido());
		
		pe.statusPedido();
		
		Pessoa pa = new Pessoa();
		Pessoa pa1 = new Pessoa();
		
		Endereco en = new Endereco();
		Gerente ge = new Gerente(); 
		Funcionario fe = new Funcionario();
		
		pa.setNome("Henrique"); 
		pa.setCpf("798564321");
		pa.setNomeUsuario("henr");
		pa.setMatricula(5464);
		pa.setCargo("Web");
		pa.setSalario(8762.32);
		pa.setStatus(true);
		pa.setSenha("842");
		
		ge.criarFuncionario(pa);
		
		pa1.setNome("Gustavo"); 
		pa1.setCpf("879856465");
		pa1.setNomeUsuario("ghdss");
		pa1.setMatricula(98654);
		pa1.setCargo("Web");
		pa1.setSalario(8762.32);
		pa1.setStatus(true);
		pa1.setSenha("842");
		
		ge.criarFuncionario(pa1);
		
		System.out.println("");
		
		ge.listaFuncionario(pa);
		
	}
	
}
