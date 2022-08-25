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

}




