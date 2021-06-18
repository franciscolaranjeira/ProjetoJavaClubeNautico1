package entidades;

public class Jovem extends Socios {
    //atributos
    private int numAulas;
    private double valorReferencia;
    private double  precoAula = 25.0; 
    private int numAulasReferencia = 4;
    
    //inicialisa o atributos expecificos
    public Jovem(String nome, int numeroContribuinte, int anoNascimento, int numAulas, String socioDirigente, double valorReferencia) {
        super(nome, numeroContribuinte, anoNascimento, socioDirigente);
        this.numAulas = numAulas;
        this.valorReferencia = valorReferencia;
    }
    
    public Jovem(String nome, int numeroContribuinte, int anoNascimento, int numAulas, String socioDirigente){
        this(nome, numeroContribuinte, anoNascimento, numAulas, socioDirigente, 100.0);
    }
 
    @Override
    public double calcularMensalidade() {
        if (numAulas <= numAulasReferencia) {
            return valorReferencia;
        }else{
            double precoAulasExtra = (numAulas - numAulasReferencia) * precoAula;
            double mensalidade = valorReferencia + precoAulasExtra;
            return mensalidade;
        }
    }

    public int getNumAulasReferencia() {
        return numAulasReferencia;
    }

    public void setNumAulasReferencia(int numAulasReferencia) {
        this.numAulasReferencia = numAulasReferencia;
    }
    
    public double getPrecoAula() {
        return precoAula;
    }

    public void setPrecoAula(double precoAula) {
        this.precoAula = precoAula;
    }
    
    public int getNumAulas() {
        return numAulas;
    }

    public void setNumAulas(int numAulas) {
        this.numAulas = numAulas;
    }

    public double getValorReferencia() {
        return valorReferencia;
    }

    public void setValorReferencia(double valorReferencia) {
        this.valorReferencia = valorReferencia;
    }

    @Override
    public String toString() {
       return super.toString() + 
         "\n| Nº aulas: " + numAulas;
    }
    
}
