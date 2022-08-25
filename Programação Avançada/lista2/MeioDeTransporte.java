package lista2;

public abstract class MeioDeTransporte {

    private int Id;
    private short ano;
    private String modelo;
    private double carga_maxima;

    public MeioDeTransporte(int id, short ano, String modelo, double carga_maxima) {
        Id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.carga_maxima = carga_maxima;
    }

    public double getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    protected abstract double consumo();
}

class Terrestre extends MeioDeTransporte {
    private int qtdeRoda;
    private double potencia;
    public Terrestre(int id, short ano, String modelo, double carga_maxima, int qtdeRoda, double potencia) {
        super(id, ano, modelo, carga_maxima);
        this.qtdeRoda = qtdeRoda;
        this.potencia = potencia;
    }

    @Override
    protected double consumo() {
        return getCarga_maxima()*potencia;
    }
}
