package Mercado.Alimentos;

public class Frutas extends Comida implements Descascador{
    public Frutas(double preco, int quantidade, double kg, String nome, String validade ) {
        super(preco, quantidade, kg, nome, validade);
    }
    @Override
    public void addalimento(){
        System.out.println("Adicionando fruta");
    }

}
