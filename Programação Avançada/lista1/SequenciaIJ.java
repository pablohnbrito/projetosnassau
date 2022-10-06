package lista1;

public class SequenciaIJ {
    public static void main(String[] args) {
        int i = 1, j = 60;

        while (j >= 0) {
            System.out.println("I = " + i + " J = " + j);
            i += 3;
            j -= 5;
        }
    }
}
