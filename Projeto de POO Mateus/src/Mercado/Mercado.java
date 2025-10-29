package Mercado;

public class Mercado {

    private String nome;
    private String endereco;
    private int lucro;

    public Mercado(String nome, String endereco, int lucro){
        this.nome = nome;
        this.endereco = endereco;
        this.lucro = lucro;
    }

    public void MostrarInfo(){
        //inserir parte do codigo

    }

    public void DinheiroArrecadado(){

        System.out.println("O lucro total foi:" + lucro);
    }
}
