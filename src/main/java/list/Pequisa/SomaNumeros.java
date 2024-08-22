package main.java.list.Pequisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public int calcularSoma(){
       int soma = 0;
       for (Integer numero : numeroList){
           soma+= numero;
       }
       return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeroList.isEmpty()){
            for (Integer numero : numeroList){
                if (numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
        return maiorNumero;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numeroList.isEmpty()){
            for(Integer numero : numeroList){
                if (numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return  menorNumero;
        }else {
            throw new RuntimeException("A lista  está vazia!");
        }
    }

    public void exibirNumeros(){
        if (!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        }else {
            throw new RuntimeException("A lista  está vazia!");
        }
    }



    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(29);
        somaNumeros.adicionarNumero(56);
        somaNumeros.adicionarNumero(46);
        System.out.println("Exibindo números adicionados:");
        somaNumeros.exibirNumeros();
        System.out.println("A soma dos números:" + somaNumeros.calcularSoma());
        System.out.println( "Menor número:" + somaNumeros.encontrarMenorNumero());
        System.out.println("Maior número:" + somaNumeros.encontrarMaiorNumero());

    }
}
