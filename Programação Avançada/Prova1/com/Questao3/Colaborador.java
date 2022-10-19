package com.Questao3;

import java.util.Date;

public class Colaborador extends Fisica{

    private String ctps;
    private String pis;
    private String tituloEleitor;
    private boolean reservista;
    private String estadoCivil;
    private int numDependentes;
    private boolean ativo;
    private String setor;
    private String cargo;
    private float salario;
    private String telefone1;
    private String telefone2;
    private String emailPessoal;
    private String emailCorporativo;
    private Usuario usuario;

    public Colaborador(String cpf, String rg, String genero, Date nasc, String ctps, String pis, String tituloEleitor, boolean reservista, String estadoCivil, int numDependentes, boolean ativo, String setor, String cargo, float salario, String telefone1, String telefone2, String emailPessoal, String emailCorporativo) {
        super(cpf, rg, genero, nasc);
        this.ctps = ctps;
        this.pis = pis;
        this.tituloEleitor = tituloEleitor;
        this.reservista = reservista;
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

    public boolean isReservista() {
        return reservista;
    }

    public void setReservista(boolean reservista) {
        this.reservista = reservista;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
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

    private void admitir() {
        this.ativo = true;
    }

    private void demitir() {
        this.ativo = false;
    }
}
