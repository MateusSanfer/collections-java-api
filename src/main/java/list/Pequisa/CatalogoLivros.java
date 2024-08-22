package main.java.list.Pequisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributos
    private List<Livro> livroList;
    public CatalogoLivros(){
        this.livroList = new ArrayList<>();}

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){//isEmpty retorta true caso a coleção não contiver elementos.
            for(Livro l: livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("O Sapo e a Sapatona", "Cigarra", 2016);
        catalogoLivros.adicionarLivro("Boleano", "Gordinho", 2022);
        catalogoLivros.adicionarLivro("Livro de faca", "Holeoa", 2023);
        catalogoLivros.adicionarLivro("Macacos me mordam", "Leoncio", 1999);
        catalogoLivros.adicionarLivro("Kicagola", "Mucama", 2009);
        catalogoLivros.adicionarLivro("O Sapo e a Sapatona", "Mucama", 2019);

        System.out.println(catalogoLivros.pesquisarPorAutor("Mucama"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("O Sapo e a Sapatona"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(1999,2023));
    }
}
