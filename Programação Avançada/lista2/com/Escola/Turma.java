package lista2.com.Escola;

public class Turma {
    private String cod;
    private Integer turno;
    private Integer sala;
    private Aluno aluno;

    public Turma(String cod, Integer turno, Integer sala, Aluno aluno) {
        this.cod = cod;
        this.turno = turno;
        this.sala = sala;
        this.aluno = aluno;
    }
}
