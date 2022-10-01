package Ex_15_Orientacao_Objetos;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String login;
	private String senha;
	private String permissao;
	
	List<Usuario> usuarios = new ArrayList<>();
	
	public Usuario() {
		
	}

	public Usuario(String login, String senha, String permissao) {
		
		super();
		this.login = login;
		this.senha = senha;
		this.permissao = permissao;
	}

	public String getLogin() {
		
		return login;
	}

	public void setLogin(String login) {
		
		this.login = login;
	}

	public String getSenha() {
		
		return senha;
	}

	public void setSenha(String senha) {
		
		this.senha = senha;
	}

	public String getPermissao() {
		
		return permissao;
	}

	public void setPermissao(String permissao) {
		
		this.permissao = permissao;
	}
	
	public void criarUsuario(Usuario usuario) {
		
		usuarios.add(usuario); 
		
		System.out.println("Usuario cadastrado com sucesso: \n " + usuario.getLogin() + " \n " + usuario.getPermissao() + "\n " + usuario.getSenha());
	}
	
	public void editarPerfil(Usuario usuario) {
		
		for(int i = 0; i < usuarios.size(); i++) {
			
			if(usuarios.get(i).getLogin().equals(usuarios)) {
				
				usuarios.get(i).setLogin(login);
				usuarios.get(i).setSenha(senha);
				usuarios.get(i).setPermissao(permissao);
			}
		}
		
		System.out.println("Usuario Editado com sucesso: \n " + usuario.getLogin() + " \n " + usuario.getPermissao() + "\n " + usuario.getSenha());
	}
	
	public void alterarSenha(Usuario usuario) {
		
		for(int i = 0; i < usuarios.size(); i++) {
			
			if(usuarios.get(i).getSenha().equals(usuarios)) {
				
				usuarios.get(i).setSenha(senha);
			}
		}
		
		System.out.println("Senha Alterado com sucesso: " + senha);
	}
	
	public void apagarUsuario(Usuario usuario) {
		
		usuarios.remove(usuario);
		
		System.out.println("Usuario Apagado com sucesso: \n ");
	}
}
