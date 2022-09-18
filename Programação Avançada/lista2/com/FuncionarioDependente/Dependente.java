package lista2.com.FuncionarioDependente;

import java.util.Date;

public class Dependente {
    private int sequencial;
    private String nomeCompleto;
    private Date dataNascimento;
    private Integer sexo;
    private boolean participaPlano;

    public Dependente(int sequencial, String nomeCompleto, Date dataNascimento, Integer sexo, boolean participaPlano) {
        this.sequencial = sequencial;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.participaPlano = participaPlano;
    }
}
