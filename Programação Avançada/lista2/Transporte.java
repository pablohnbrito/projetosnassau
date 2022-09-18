package lista2;

public class Transporte {

    //exercício 1
    private int Id, ano;
    private String modelo;
    private double cargaMaxima, potencia;

    public Transporte(int id, int ano, String modelo, double cargaMaxima, double potencia) {
        Id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.potencia = potencia;
    }

    public double consumo (double potencia, double cargaMaxima) {
        double consumoTotal = potencia*cargaMaxima;
        return consumoTotal;
    }

    public void gravaModelo(String modelo) {
        this.modelo = modelo;
    }

    public String leiaModelo() {
        return this.modelo;
    }

}
