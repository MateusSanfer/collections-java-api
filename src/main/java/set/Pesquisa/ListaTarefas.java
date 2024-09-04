package main.java.set.Pesquisa;


import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefasParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefasParaRemover);
        } else {
            System.out.println("O conjunto está vazio!");
        }

        if (tarefasParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Tarefas não encontrada!");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (t.isStatus()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (!t.isStatus()){
                tarefasNaoConcluidas.add(t);
            }
        }
        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t: tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setStatus(true);
            }
        }
    }

    public void marcarTarefasPendente(String descricao){
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarComoPendente != null){
            if (tarefaParaMarcarComoPendente.isStatus()){
                tarefaParaMarcarComoPendente.setStatus(false);
            }
        }else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas(){
        if (tarefaSet.isEmpty()){
            System.out.println("A lista já está vazia!");
        }else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();
        listaTarefa.adicionarTarefa("Macaco velho");
        listaTarefa.adicionarTarefa("Como eu vou lembrar de tanta coisa?");
        listaTarefa.adicionarTarefa("Será que vou ser contratado por alguma empresa?");
        listaTarefa.adicionarTarefa("Como posso me destacar se não consigo fazer nada, sozinho?");
        listaTarefa.exibirTarefas();

        listaTarefa.removerTarefa("Macaco velho");
        listaTarefa.exibirTarefas();

        System.out.println("Total de tarefas: " + listaTarefa.contarTarefas());
        System.out.println(listaTarefa.obterTarefasPendentes());

        listaTarefa.marcarTarefaConcluida("Como eu vou lembrar de tanta coisa?");
        listaTarefa.marcarTarefaConcluida("Será que vou ser contratado por alguma empresa?");

        System.out.println(listaTarefa.obterTarefasConcluidas());

        listaTarefa.marcarTarefasPendente("Como posso me destacar se não consigo fazer nada, sozinho?");
        listaTarefa.exibirTarefas();

        listaTarefa.limparListaTarefas();
        listaTarefa.exibirTarefas();


    }
}
