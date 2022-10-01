package Ex_15_Orientacao_Objetos;

import java.util.ArrayList;

public class Colaborador {
	
	private String ctps;
	private String pis;
	private String tituloEleitor;
	private boolean resevista;
	private String estadoCivil;
	private int numDependentes;
	private boolean ativo;
	private String setor;
	private String cargo;
	private double salario;
	private String telefone1;
	private String telefone2;
	private String emailPessoal;
	private String emailCorporativo;
	
	private Usuario usuario;
	
	private ArrayList<Usuario> usuarios = new ArrayList<>();
	private ArrayList<Colaborador> colaboradores = new ArrayList<>();
	
	public Colaborador() {
		
		
	}

	public Colaborador(String ctps, String pis, String tituloEleitor, boolean resevista, String estadoCivil,
			int numDependentes, boolean ativo, String setor, String cargo, double salario, String telefone1,
			String telefone2, String emailPessoal, String emailCorporativo, Usuario usuario) {
		super();
		this.ctps = ctps;
		this.pis = pis;
		this.tituloEleitor = tituloEleitor;
		this.resevista = resevista;
		this.estadoCivil = estadoCivil;
		this.numDependentes = numDependentes;
		this.ativo = ativo;
		this.setor = setor;
		this.cargo = cargo;
		this.salario = salario;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.emailPessoal = emailPessoal;
		this.emailCorporativo = emailCorporativo;
		this.usuario = usuario;
	}

	public String getCtps() {
		
		return ctps;
	}

	public void setCtps(String ctps) {
		
		this.ctps = ctps;
	}

	public String getPis() {
		
		return pis;
	}

	public void setPis(String pis) {
		
		this.pis = pis;
	}

	public String getTituloEleitor() {
		
		return tituloEleitor;
	}

	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}

	public boolean isResevista() {
		return resevista;
	}

	public void setResevista(boolean resevista) {
		this.resevista = resevista;
	}

	public String getEstadoCivil() {
		
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		
		this.estadoCivil = estadoCivil;
	}

	public int getNumDependentes() {
		
		return numDependentes;
	}

	public void setNumDependentes(int numDependentes) {
		this.numDependentes = numDependentes;
	}

	public boolean isAtivo() {
		
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		
		this.ativo = ativo;
	}

	public String getSetor() {
		
		return setor;
	}

	public void setSetor(String setor) {
		
		this.setor = setor;
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

	public String getTelefone1() {
		
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		
		this.telefone2 = telefone2;
	}

	public String getEmailPessoal() {
		
		return emailPessoal;
	}

	public void setEmailPessoal(String emailPessoal) {
		
		this.emailPessoal = emailPessoal;
	}

	public String getEmailCorporativo() {
		
		return emailCorporativo;
	}

	public void setEmailCorporativo(String emailCorporativo) {
		
		this.emailCorporativo = emailCorporativo;
	}
	

	public Usuario getUsuario() {
		
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		
		this.usuario = usuario;
	}

	
	public void admitir(Usuario usuario, Colaborador colaborador) {
		
		usuarios.add(usuario);
		colaboradores.add(colaborador);
		
		System.out.println("Usuario, Admitido com sucesso: " + usuario.getLogin());
	}
	
	public void demitir(Usuario usuario, Colaborador colaborador) {
		
		usuarios.remove(usuario); 
		colaboradores.remove(colaborador); 
		
		System.out.println("Usuario, Demitido com sucesso: " + usuario.getLogin());
	}
}
