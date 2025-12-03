package Projeto.src;

import java.util.ArrayList;

public class Cliente {
    private String nome; //Atributos
    private String cpf;
    //Aqui ocorre polimorfismo pois o tipo da lista é a superclasse Produto mas na prática elaa guarda objetos de suas subclasses
    private ArrayList<Produto> carrinho = new ArrayList<>(); //Lista de Produto em que o carrinho pode conte qualquer objeto que seja um produto ou sua subclasse
    //Construtor usado quando se faz new Cliente(...) servindo para inicializar os atributos
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    //Metodo onde ocorre polimorfismo
    public void adicionarProduto(Produto p) {
        carrinho.add(p);
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void mostrarCompras() {
        System.out.println("\n--- Produtos comprados por " + nome + " ---");

        if (carrinho.isEmpty()) {
            System.out.println("Nenhum item comprado.");
            return;
        }

        double total = 0;

        for (Produto p : carrinho) {
            System.out.println("- " + p.getNome() + " | R$ " + p.getPreco());
            total += p.getPreco();
        }

        System.out.println("TOTAL = R$ " + total);
    }

    public String getNome() {
        return nome;
    }
}
