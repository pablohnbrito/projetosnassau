package lista2.com.Escola;

import java.util.Date;

public class Aluno {
    private String matricula;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String sexo;
    private String endereco;
    private String cidade;
    private String uf;

    public Aluno(String matricula, String nome, String cpf, Date dataNascimento, String sexo, String endereco, String cidade, String uf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
    }
}
