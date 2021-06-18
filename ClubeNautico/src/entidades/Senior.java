package entidades;

public class Senior extends Socios {
    //atributos
    private String tipoSenior;
    public static int idSenior = 0;
    private double valorReferenciaSenior;
    private double desconto = 10.0 / 1000.0;
    
    //inicialisa o atributos expecificos
    public Senior(String tipoSenior, String nome, int numeroContribuinte, int anoNascimento, String socioDirigente, double valorReferencia) {
        super(nome, numeroContribuinte, anoNascimento, socioDirigente);
        Senior.idSenior++;
        this.tipoSenior = tipoSenior + idSenior;
        this.valorReferenciaSenior = valorReferencia;

    }
    //instacia na class testeSocios
    public Senior(String nome, int numeroContribuinte, int anoNascimento, String socioDirigente) {
        this("SSenior-", nome, numeroContribuinte, anoNascimento, socioDirigente, 150.0);
    }

    @Override
    public double calcularMensalidade() {
        int idade = getAnoNascimento();
        if (getSocioDirigente().equalsIgnoreCase("S") || idade >= 100) {
            return 0.0;
        } else {
            int resto = idade % 10;
            int decadaIdade = idade - resto;
            double mensalidade = valorReferenciaSenior - Math.round(valorReferenciaSenior * (decadaIdade * desconto));
            return mensalidade;
        }
    }

    @Override
    public String toString() {
        return "\n| Sócio: " + tipoSenior
                + super.toString();
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getTipoSenior() {
        return tipoSenior;
    }

    public static int getIdSenior() {
        return idSenior;
    }

    public double getValorReferenciaSenior() {
        return valorReferenciaSenior;
    }

    public void setValorReferenciaSenior(double valorReferenciaSenior) {
        this.valorReferenciaSenior = valorReferenciaSenior;
    }

}
