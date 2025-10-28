package Mercado.Alimentos;

public class Frios extends Comida {
    public Frios(double preco, int quantidade, double kg, String nome, String validade, String marca ) {
        super(preco, quantidade, kg, nome, validade, marca);
    }
    @Override
    public void addalimento(){
        System.out.println("Adicionando frios");
    }

}