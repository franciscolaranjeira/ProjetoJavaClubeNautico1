package entidades;

import java.util.ArrayList;
import java.util.List;

public class EncarregadoEducacao {

    private String nome;
    private int menoresACargo = 0;
    private List<String> nomeMenor = new ArrayList<>();

    public EncarregadoEducacao(String nome) {
        this.nome = nome;
    }

    public List<String> getNomeMenor() {
        return nomeMenor;
    }

    public void setNomeMenor(List<String> nomeMenor) {
        this.nomeMenor = nomeMenor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMenoresACargo() {
        return menoresACargo;
    }

    public void setMenoresACargo(int menoresACargo) {
        this.menoresACargo = menoresACargo;
    }

    public void listaEncarregadosEducacao() {
        System.out.println("\nNome: " + nome + "\t --> Nº menores a cargo " + menoresACargo + " --> Nomes: " + nomeMenor);
    }
}
