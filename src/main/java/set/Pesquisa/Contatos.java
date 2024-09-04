package main.java.set.Pesquisa;

import java.util.Objects;

public class Contatos {
    private String nome;
    private int numero;

    public Contatos(String nome, int telefone) {
        this.nome = nome;
        this.numero = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTelefone() {

        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contatos contatos)) return false;
        return Objects.equals(getNome(), contatos.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "nome='" + nome + '\'' +
                ", telefone=" + numero +
                '}';
    }
}
