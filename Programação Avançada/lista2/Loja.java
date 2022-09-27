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

    public int getCodigoDoItem() {
        return codigoDoItem;
    }

    public void setCodigoDoItem(int codigoDoItem) {
        this.codigoDoItem = codigoDoItem;
    }

    public String getNomeDoItem() {
        return nomeDoItem;
    }

    public void setNomeDoItem(String nomeDoItem) {
        this.nomeDoItem = nomeDoItem;
    }

    public String getDescricaoDoItem() {
        return descricaoDoItem;
    }

    public void setDescricaoDoItem(String descricaoDoItem) {
        this.descricaoDoItem = descricaoDoItem;
    }

    public double getValorDoItem() {
        return valorDoItem;
    }

    public void setValorDoItem(double valorDoItem) {
        this.valorDoItem = valorDoItem;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
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

    public Integer getSelo() {
        return selo;
    }

    public void setSelo(Integer selo) {
        this.selo = selo;
    }
}