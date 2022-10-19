package com.Questao3;

public class Usuario {
    private String login;
    private String senha;
    private String permissao;

    public Usuario(String login, String senha, String permissao) {
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

    private void editarPerfil(String login) {
            this.login = login;
    }

    private void alterarSenha(String senha) {
        this.senha = senha;
    }

    private void criarUsuario (Usuario usuario, String senha, String permissao, String login) {
        usuario = new Usuario(login, senha, permissao);
    }

    private void apagarUsuario(Usuario usuario) {
        usuario = null;
    }



}
