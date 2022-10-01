package Ex_15_Orientacao_Objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Programacao_Principal {

	public static void main(String[] args) throws ParseException {
		
		Colaborador co = new Colaborador();
		Fisica fi = new Fisica();
		Juridica juri = new Juridica(); 
		Parceiro pa = new Parceiro(); 
		Pessoa pe = new Pessoa(); 
		Usuario us = new Usuario(); 
		
		Usuario us1 = new Usuario(); 
		
		us.setLogin("ghdss");
		us.setPermissao("Adm");
		us.setSenha("123"); 
		
		us1.setLogin("ghdss31");
		us1.setPermissao("user");
		us1.setSenha("1234"); 
		
		us.criarUsuario(us);
		us.editarPerfil(us1);
		
		us.apagarUsuario(us);
		us.apagarUsuario(us1);
		
		String nasc = "09/02/1991";
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = formato.parse(nasc);
		
		fi.setCpf("1232156465"); 
		fi.setRg("23156578"); 
		fi.setGenero("Masculino"); 
		fi.setNasc(dataFormatada);
		
		String fundacao = "09/02/2021";
		
		SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada1 = formato.parse(fundacao);
		
		juri.setCnpj("98756423132564");
		juri.setInscricaoEstadual("9876543223231");
		juri.setFundacao(dataFormatada);
		
		pa.cadastrar(fi, juri);
		
		pa.excluir(fi, juri);
		
		co.setCtps("6545645689");
		co.setPis("654654632132"); 
		co.setTituloEleitor("3215646598797");
		co.setResevista(true); 
		co.setEstadoCivil("Solteiro"); 
		co.setNumDependentes(3); 
		co.setAtivo(true); 
		co.setCargo("Gerente"); 
		co.setSalario(1500.45); 
		co.setTelefone1("898765465132");
		co.setTelefone2("321546546546");
		co.setEmailPessoal("gustavo@gmail.com");
		co.setEmailCorporativo("doni@gmail.com"); 
		
		co.admitir(us, co); 
		co.demitir(us1, co);
	}

}
