package com.Questao3;

import java.util.Date;
import java.util.List;

public class Fisica extends  Pessoa {
    private String cpf;
    private String rg;
    private String genero;
    private Date nasc;
    private List<Parceiro> parceiro;

    public Fisica(String cpf, String rg, String genero, Date nasc) {
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.nasc = nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getNasc() {
        return nasc;
    }

    public void setNasc(Date nasc) {
        this.nasc = nasc;
    }
}
