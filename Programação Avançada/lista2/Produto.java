package lista2;

import java.util.Date;

public class Produto {

    private int Id;
    private String nome, descricao;
    private Date validade;

    public Produto(int id, String nome, String descricao, Date validade) {
        Id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.validade = validade;
    }
    public int getCod(String nome) {
        return Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
}




