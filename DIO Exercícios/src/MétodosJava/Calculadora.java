package MétodosJava;

public class Calculadora {
    private int i, j;

    public Calculadora(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int soma() {
        return i+j;
    }
    public int subtracao() {
        return i-j;
    }

    public int multiplicacao() {
        return i*j;
    }

    public int divisao() {
        return i / j;
    }
}
