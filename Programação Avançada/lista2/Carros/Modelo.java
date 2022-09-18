package lista2.Carros;

public class Modelo {
    private int codigo;
    private String marca;
    private String nome;
    private double motor;
    private int serie;
    private Item item;

    public Modelo(int codigo, String marca, String nome, double motor, int serie, Item item) {
        this.codigo = codigo;
        this.marca = marca;
        this.nome = nome;
        this.motor = motor;
        this.serie = serie;
        this.item = item;
    }
}
