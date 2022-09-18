package lista2.Carros;

import java.util.Date;

public class Carro {
    private String chassi;
    private String cor;
    private int anoFabricacao;
    private int anoModelo;
    private Date dataEntrada;
    private Modelo modelo;

    public Carro(String chassi, String cor, int anoFabricacao, int anoModelo, Date dataEntrada, Modelo modelo) {
        this.chassi = chassi;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.dataEntrada = dataEntrada;
        this.modelo = modelo;
    }
}
