package Mercado.Alimentos;

public abstract class Produto {
    protected String tipo;
    protected double preco; //Protected pois as frutas podem herdar como public mas as outras classes que não herdam é private
    protected int quantidade;
    protected String nome;


    public Produto(int quantidade, String nome, double preco, String tipo) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public void QuantidadeComprada() {

    }

    public void Addproduto() {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
