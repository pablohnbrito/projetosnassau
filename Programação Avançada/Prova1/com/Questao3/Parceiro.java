package com.Questao3;

public class Parceiro {
    private String tipoPessoa;
    private float desempenho;
    private boolean bloqueado;

    public Parceiro(String tipoPessoa, float desempenho) {
        this.tipoPessoa = tipoPessoa;
        this.desempenho = desempenho;
    }

    public void cadastrar(Parceiro parceiro, String tipoPessoa, float desempenho) {
        parceiro = new Parceiro(tipoPessoa, desempenho);
    }

    public void excluir(Parceiro parceiro) {
        parceiro = null;
    }

    public void bloquear() {
        this.bloqueado = true;
    }

}
