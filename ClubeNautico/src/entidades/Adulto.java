package entidades;

public class Adulto extends Jovem {

    private String tipoAdulto;
    public static int idAdulto = 0;
    private static int idadeMaximaAdulto = 59;
    //inicialisa o atributos expecificos
    public Adulto(String tipoAdulto, String nome, int numeroContribuinte, int anoNascimento, int numAulas, String socioDirigente) {
        super(nome, numeroContribuinte, anoNascimento, numAulas, socioDirigente);
        Adulto.idAdulto++;
        this.tipoAdulto = tipoAdulto + idAdulto;
    }
    //instacia na class testeSocios
    public Adulto(String nome, int numeroContribuinte, int anoNascimento, int numAulas, String socioDirigente) {
        this("SAdulto-", nome, numeroContribuinte, anoNascimento, numAulas, socioDirigente);
    }

    @Override
    public double calcularMensalidade() {
        if (getSocioDirigente().equalsIgnoreCase("S")) {
            return 0.0;
        } else {
            double mensalidade = super.calcularMensalidade();
            return mensalidade;
        }
    }

    @Override
    public String toString() {
        return "\n| Socio: " + tipoAdulto
                + super.toString();
    }

    public static int getIdadeMaximaAdulto() {
        return idadeMaximaAdulto;
    }

    public static void setIdadeMaximaAdulto(int idadeMaximaAdulto) {
        Adulto.idadeMaximaAdulto = idadeMaximaAdulto;
    }
    
    
    public String getTipoAdulto() {
        return tipoAdulto;
    }

    public static int getIdAdulto() {
        return idAdulto;
    }
}
