package main.java.list.OperacoesBasicas;

public class Item {
    public String nome;
    public double preco;
    public int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString() {
        return "Item{nome='" + this.nome + "', preco=" + this.preco + ", quant=" + this.quantidade + "}";
    }
}
