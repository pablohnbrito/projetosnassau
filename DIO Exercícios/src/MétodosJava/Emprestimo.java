package MétodosJava;
import java.text.DecimalFormat;

public class Emprestimo {
    private double value;
    private final double tax = (float) 1.01;
    private int month;

    public Emprestimo( float value, int month) {
        this.value = value;
        this.month = month;
    }
    DecimalFormat deci = new DecimalFormat("0.00");
    public String valorParcelas () {
        float aftermath;
        aftermath = (float) (value*(Math.pow(tax, month)));
        return deci.format(aftermath/month);
    }
}
