package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    private List<Integer> numeroList;

    public OrdenacaoNumero(){
        this.numeroList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()){
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()){
            numerosAscendentes.sort(Collections.reverseOrder());
            return numerosAscendentes;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if (!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();
        ordenacaoNumero.adicionarNumero(45);
        ordenacaoNumero.adicionarNumero(2);
        ordenacaoNumero.adicionarNumero(56);
        ordenacaoNumero.adicionarNumero(175);

        ordenacaoNumero.exibirNumeros();

        System.out.println(ordenacaoNumero.ordenarAscendente());
        ordenacaoNumero.exibirNumeros();
        System.out.println(ordenacaoNumero.ordenarDescendente());
        ordenacaoNumero.exibirNumeros();
    }
}
