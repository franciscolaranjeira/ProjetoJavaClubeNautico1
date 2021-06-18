package entidades;

public class Menor extends Jovem {
    //atributos
    private String tipoMenor;  
    public static int idMenor = 0;
    private EncarregadoEducacao encEdu;
    private double desconto = 20.0 / 100.0;
    private static int idadeMaximaMenor = 17;
    
    //inicialisa o atributos expecificos
    public Menor(String tipoMenor, String nome, int numeroContribuinte, int anoNascimento, int numAulas, String socioDirigente, EncarregadoEducacao encEdu) {
        super(nome, numeroContribuinte, anoNascimento, numAulas, socioDirigente);
        Menor.idMenor++;
        this.tipoMenor = tipoMenor + idMenor;
        this.encEdu = encEdu;
    }
    //instacia na class testeSocios
    public Menor(String nome, int numeroContribuinte, int anoNascimento, int numAulas, EncarregadoEducacao encEdu){
        this("SMenor-", nome, numeroContribuinte, anoNascimento, numAulas, "N", encEdu);
    }

    @Override
    public double calcularMensalidade() {
        double mensalidade = super.calcularMensalidade() - (super.calcularMensalidade() * desconto);
        return mensalidade;
    }

    public static int getIdadeMaximaMenor() {
        return idadeMaximaMenor;
    }

    public static void setIdadeMaximaMenor(int idadeMaximaMenor) {
        Menor.idadeMaximaMenor = idadeMaximaMenor;
    }
    

    public EncarregadoEducacao getEncEdu() {
        return encEdu;
    }

    public void setEncEdu(EncarregadoEducacao encEdu) {
        this.encEdu = encEdu;
    }

    public static int getIdMenor() {
        return idMenor;
    }

    public String getTipoMenor() {
        return tipoMenor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "\n| Socio: " + tipoMenor
                + super.toString()
                + "\n| Encarregado de Educação: " + encEdu.getNome();
    }
}
