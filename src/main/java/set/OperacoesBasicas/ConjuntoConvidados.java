package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
//Atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarCovidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarCovidados() + " convidados dentro do Set Convidados");
        conjuntoConvidados.adicionarConvidado("Matuas", 12345);
        conjuntoConvidados.adicionarConvidado("Jacão", 42555);
        conjuntoConvidados.adicionarConvidado("Sativa", 12345);
        conjuntoConvidados.adicionarConvidado("Ficaras", 435223);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarCovidados() + " convidados dentro do Set Convidados");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(42555);
        System.out.println("Existem " + conjuntoConvidados.contarCovidados() + " convidados dentro do Set Convidados");
        conjuntoConvidados.exibirConvidados();
    }
}
