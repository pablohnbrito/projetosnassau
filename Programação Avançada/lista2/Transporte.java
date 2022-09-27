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

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
