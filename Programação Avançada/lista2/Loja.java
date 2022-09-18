package lista2;

public abstract class Loja {
    private int codigoDoItem;
    private String nomeDoItem;
    private String descricaoDoItem;
    private double valorDoItem;

    public Loja(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem) {
        this.codigoDoItem = codigoDoItem;
        this.nomeDoItem = nomeDoItem;
        this.descricaoDoItem = descricaoDoItem;
        this.valorDoItem = valorDoItem;
    }

    public int getIdentificador() {
        return codigoDoItem;
    }
}

class Ferramenta extends Loja {
    private String categoria;
    private Integer serial;

    public Ferramenta(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem, String categoria, Integer serial) {
        super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
        this.categoria = categoria;
        this.serial = serial;

    }

    @Override
    public int getIdentificador() {
        return serial;
    }

    public void separar(String categoria) {
        if (categoria == null) this.categoria = "Outros";
        else this.categoria = categoria;
    }

}

class Alimento extends  Loja {
    private Integer selo;

    public Alimento(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem, Integer selo) {
        super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
        this.selo = selo;
    }

    @Override
    public int getIdentificador() {
        return selo;
    }
}