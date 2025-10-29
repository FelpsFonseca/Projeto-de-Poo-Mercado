package Mercado.Alimentos;

public class Comida extends Produto implements Descartavel{

    private double peso;
    private String validade;

    public Comida(double preco, int quantidade, double peso, String nome, String validade,  String tipo) {
        super(quantidade, nome, preco);
        this.peso = peso;
        this.validade = validade;

    }
    public double getPeso()
    {
        return peso;
    }

    public String getValidade()
    {
        return validade;
    }

    @Override
    public void Addproduto(){
        System.out.println("Adicionando comida");
    }

    @Override
    public void Descartar() {
        System.out.println("Produto descartado");
    }
}
