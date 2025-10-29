package Mercado.Alimentos;

public class Utensilio extends Produto {
    private String marca;


    public Utensilio(int quantidade, String nome, double preco, String marca, String tipo) {
        super(quantidade, nome, preco);
        this.marca = marca;

    }


    public String getMarca()
    {
        return marca;
    }

    @Override
    public void Addproduto(){
        System.out.println("Adicionando Utensilio");
    }

}