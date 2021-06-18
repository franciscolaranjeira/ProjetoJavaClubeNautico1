package entidades;

import java.time.LocalDate;

public abstract class Socios {
      
    private String nome;
    private int numeroContribuinte;
    private int anoNascimento;
    private String socioDirigente;

    public LocalDate data = LocalDate.now();
    public int ano = data.getYear();
    
    //inicialisacao de atributos
    public Socios(String nome, int numeroContribuinte, int anoNascimento, String socioDirigente) {
        this.nome = nome;
        this.numeroContribuinte = numeroContribuinte;
        this.anoNascimento = anoNascimento;
        this.socioDirigente = socioDirigente;       
    }
  
    public abstract double calcularMensalidade();

    @Override
    public String toString() {
        return "\n| Nome: " + this.nome
                + "\n| Numero Contribuinte: " + this.numeroContribuinte
                + "\n| Idade: " + getAnoNascimento() + " anos"
                + "\n| É sócio dirigente: " + this.socioDirigente;
    }

    public String getSocioDirigente() {
        return socioDirigente;
    }

    public void setSocioDirigente(String socioDirigente) {
        this.socioDirigente = socioDirigente;
    }

    public  int getAno() {
        return ano;
    }

    public  void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        
        return nome;
    }

    public void setNome(String nome) {
        
        this.nome = nome;
    }

    public int getNumeroContribuinte() {
        return numeroContribuinte;
    }

    public void setNumeroContribuinte(int numeroContribuinte) {
        this.numeroContribuinte = numeroContribuinte;
    }

    public int getAnoNascimento() {
        int idade = ano - anoNascimento;;
        return idade;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

}
