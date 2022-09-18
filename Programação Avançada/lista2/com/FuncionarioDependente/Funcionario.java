package lista2.com.FuncionarioDependente;

import java.util.Date;

public class Funcionario {
    private Integer matricula;
    private String nomeCompleto;
    private String cpf;
    private Date dataNascimento;
    private Integer sexo;
    private double salario;
    private int telefone;
    private Dependente dependente;

    public Funcionario(Integer matricula, String nomeCompleto, String cpf, Date dataNascimento, Integer sexo, double salario, int telefone, Dependente dependente) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.salario = salario;
        this.telefone = telefone;
        if (dependente == null) this.dependente = null;
        else this.dependente = dependente;
    }
}
