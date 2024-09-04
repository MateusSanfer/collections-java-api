package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contatos> contatosSet;

    public AgendaContatos(){
        this.contatosSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contatos(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatosSet);
    }

    public Set<Contatos> pesquisarPorNome(String nome){
        Set<Contatos> contatosPorNome = new HashSet<>();
        for (Contatos c: contatosSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contatos atualizarNumeroContato(String nome, int novoNumero){
        Contatos contatosAtualizado = null;
        for (Contatos c : contatosSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatosAtualizado = c;
                break;
            }
        }
        return contatosAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Mateus", 23232323);
        agendaContatos.adicionarContato("Camila", 23232323);
        agendaContatos.adicionarContato("Mateus", 97655555);
        agendaContatos.adicionarContato("Juava", 65334353);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Mateus"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Mateus", 12345678));

        agendaContatos.exibirContato();
    }
}
