package aplicacao;

import entidades.Adulto;
import entidades.Menor;
import entidades.Senior;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.EncarregadoEducacao;
import java.time.LocalDate;

public class TestSocios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate data = LocalDate.now();
        int ano = data.getYear();
    /*=================================================================================================*/
        //CRIAÇAO ENCARREGADOS DE EDUCACAO
        EncarregadoEducacao encEdu1 = new EncarregadoEducacao("Antonieta");
        EncarregadoEducacao encEdu2 = new EncarregadoEducacao("Marta");
        EncarregadoEducacao encEdu3 = new EncarregadoEducacao("Manuela");
    /*=================================================================================================*/    
        //CRIACAO MENORES
        Menor menor1 = new Menor("Julio", 210252100, 2010, 6, encEdu1);
        Menor menor2 = new Menor("Sara", 433412730, 2011, 4, encEdu2);
        Menor menor3 = new Menor("Eduarda", 760988199, 2008, 7, encEdu3);
        Menor menor4 = new Menor("Olívia", 703978383, 2008, 5, encEdu1);
    /*=================================================================================================*/
        //CRIACAO ADULTOS
        Adulto adulto1 = new Adulto("Maria", 1234, 1987, 7, "N");
        Adulto adulto2 = new Adulto("Leonardo", 893294120, 1999, 8, "N");
        Adulto adulto3 = new Adulto("Eduardo", 473514717, 2001, 9, "N");
        Adulto adulto4 = new Adulto("Maria", 209644791, 2000, 6, "N");
    /*=================================================================================================*/
        //CRIACAO SENIORES
        Senior senior1 = new Senior("Manuel", 351055505, 1955, "N");
        Senior senior2 = new Senior("Gabriela", 867324987, 1945, "N");
        Senior senior3 = new Senior("Elisa", 700566421, 1939, "N");
        Senior senior4 = new Senior("Joaquim", 951290238, 1957, "S");
    /*=================================================================================================*/
        //LISTA ENCARREGADOS DE EDUCACAO
        List<EncarregadoEducacao> encarregadosEducacao = new ArrayList<>();
        encarregadosEducacao.add(encEdu1);
        encarregadosEducacao.add(encEdu2);
        encarregadosEducacao.add(encEdu3);
    /*=================================================================================================*/
        //LISTA MENORES
        List<Menor> listaMenores = new ArrayList();
        listaMenores.add(menor1);
        listaMenores.add(menor2);
        listaMenores.add(menor3);
        listaMenores.add(menor4);

        //LISTA ADULTOS
        List<Adulto> listaAdultos = new ArrayList();
        listaAdultos.add(adulto1);
        listaAdultos.add(adulto2);
        listaAdultos.add(adulto3);
        listaAdultos.add(adulto4);

        //LISTA SENIORES
        List<Senior> listaSeniores = new ArrayList();
        listaSeniores.add(senior1);
        listaSeniores.add(senior2);
        listaSeniores.add(senior3);
        listaSeniores.add(senior4);
    /*=================================================================================================*/
        //MENU
        int opcao = 0;
        do {
            System.out.println("|==================================|");
            System.out.println("|     MENSALIDADE CLUBE NAUTICO    |");
            System.out.println("|==================================|");
            System.out.println("|     1 - DADOS SÓCIOS MENORES     |");
            System.out.println("|     2 - DADOS SÓCIOS ADULTOS     |");
            System.out.println("|     3 - DADOS SÓCIOS SENIORES    |");
            System.out.println("|     4 - NOVO SÓCIO               |");
            System.out.println("|     5 - ENCARREGADO DE EDUCAÇÃO  |");
            System.out.println("|     6 - TOTAL FATURAÇÃO JOVEM    |");
            System.out.println("|     7 - TOTAL FATURAÇÃO SÉNIOR   |");
            System.out.println("|     8 - TOTAL FATURAÇÃO          |");
            System.out.println("|     9 - PESO FATURAÇÃO           |");
            System.out.println("|     0 - SAIR                     |");
            System.out.println("|==================================|");
              System.out.print("|     Opcão: ");
            opcao = Utilitarios.valicacaoInteiro(opcao);
            System.out.println("|==================================|");
            switch (opcao) {
                case 1://DADOS MENORES
                    System.out.println("|==================================|");
                    for (Menor menor : listaMenores) {
                        System.out.println(menor);
                        System.out.println("| Valor da mensalidade: " + menor.calcularMensalidade() + " €");
                        System.out.println();
                        System.out.println("|==================================|");
                    }
                    break;
/*==============================================================================================================*/            
                case 2://DADOS ADULTOS
                    System.out.println("|==================================|");
                    for (Adulto adulto : listaAdultos) {
                        System.out.println(adulto);
                        System.out.println("| Valor da mensalidade: " + adulto.calcularMensalidade() + " €");
                        System.out.println();
                        System.out.println("|==================================|");
                    }
                    break;
/*==============================================================================================================*/                
                case 3://DADOS SENIORES
                    System.out.println("|==================================|");
                    for (Senior senior : listaSeniores) {
                        System.out.println(senior);
                        System.out.println("| Valor da mensalidade: " + senior.calcularMensalidade() + " €");
                        System.out.println();
                        System.out.println("|==================================|");
                    }
                    break;
/*==============================================================================================================*/                
                case 4://ADICIONAR SOCIO
                    //NOME
                    System.out.println("\n");
                    System.out.println("|==================================|");
                    System.out.println("|            NOVO SOCIO            |");
                    System.out.println("|==================================|");
                    String nome = "";
                    do {
                        System.out.println("| Introduza o nome: ");
                        System.out.print("| ");
                        nome = sc.nextLine();
                    } while (!(Utilitarios.validacaoTexto(nome)));
                    nome = Utilitarios.primeiraLetraMaiusculas(nome);
                    System.out.println("|==================================|");
                    /*---------------------------------------------------------------*/
                    //NUMERO CONTRIBUINTE
                    System.out.println("| Insira o numero de contribuinte:");
                    System.out.print("| ");
                    int numCtr = 0;
                    numCtr = Utilitarios.validaNif(numCtr);
                    System.out.println("|==================================|");
                    /*---------------------------------------------------------------*/
                    //NUMERO DE AULAS
                    System.out.print("| Adicione o numero de aulas: ");
                    int aulasExt = 0;
                    aulasExt = Utilitarios.valicacaoInteiro(aulasExt);
                    System.out.println("|==================================|");
                    /*---------------------------------------------------------------*/
                    //ANO NASCIMENTO
                    System.out.print("| Insira o ano de nascimento: ");
                    int anoNasc = 0;
                    Utilitarios utilitario = new Utilitarios();
                    anoNasc = utilitario.validarAnoNascimento(anoNasc);
                    System.out.println("|==================================|");
                    /*---------------------------------------------------------------*/
                    //SE FOR MENOR
                    if (ano - anoNasc <= Menor.getIdadeMaximaMenor()) {
                        //NOME ENCARREGADO EDUCACAO
                        String nomeEncEdu = "";
                        do {
                            System.out.println("| Adicione o nome do \n"
                                    + "| encarregado de educacao: ");
                            System.out.print("| ");
                            nomeEncEdu = sc.nextLine();
                        } while (!(Utilitarios.validacaoTexto(nomeEncEdu)));
                        nomeEncEdu = Utilitarios.primeiraLetraMaiusculas(nomeEncEdu);
                        System.out.println("|==================================|");
                        /*---------------------------------------------------------------*/
                        //INSERIR NO ARRAY LIST
                        for (EncarregadoEducacao encarregado : encarregadosEducacao) {
                            if (nomeEncEdu.equalsIgnoreCase(encarregado.getNome())) {
                                listaMenores.add(new Menor(nome, numCtr, anoNasc, aulasExt, encarregado));
                                break;
                            } else {
                                listaMenores.add(new Menor(nome, numCtr, anoNasc, aulasExt, new EncarregadoEducacao(nomeEncEdu)));
                                for (Menor menor : listaMenores) {
                                    if (listaMenores.lastIndexOf(menor) == listaMenores.size() - 1) {
                                        encarregadosEducacao.add(menor.getEncEdu());
                                    }
                                }
                            }
                            System.out.println("|      SOCIO MENOR ADICIONADO!     |");
                            System.out.println("|==================================|");
                            break;
                        }
                        /*---------------------------------------------------------------*/
                        //SE FOR ADULTO
                    } else if (ano - anoNasc < Adulto.getIdadeMaximaAdulto()) {
                        //DIRIGENTE
                        String dirigente = "";
                        do {
                            System.out.print("| É dirigente (S) ou (N): ");
                            dirigente = sc.nextLine();
                        } while (!(Utilitarios.validacaoDirigente(dirigente)));
                        dirigente = Utilitarios.primeiraLetraMaiusculas(dirigente);
                        System.out.println("|==================================|");
                        /*---------------------------------------------------------------*/                       
                        //INSERIR NO ARRAY LIST
                        listaAdultos.add(new Adulto(nome, numCtr, anoNasc, aulasExt, dirigente));

                        /*---------------------------------------------------------------*/
                        System.out.println("|      SOCIO ADULTO ADICIONADO!    |");
                        System.out.println("|==================================|");
                        /*---------------------------------------------------------------*/
                        //SE FOR SENIOR
                    } else {                       
                        //DIRIGENTE
                        String dirigente = "";
                        do {
                            System.out.print("| É dirigente (S) ou (N): ");
                            dirigente = sc.nextLine();
                        } while (!(Utilitarios.validacaoDirigente(dirigente)));
                        dirigente = Utilitarios.primeiraLetraMaiusculas(dirigente);
                        System.out.println("|==================================|");
                        /*---------------------------------------------------------------*/                       
                        //INSERIR NO ARRAY LIST
                        listaSeniores.add(new Senior(nome, numCtr, anoNasc, dirigente));
                        /*---------------------------------------------------------------*/

                        System.out.println("|      SOCIO SENIOR ADICIONADO!    |");
                        System.out.println("|==================================|");
                    }
                    break;
/*==============================================================================================================*/
                case 5://LISTA ENCARREGADOS DE EDUCACAO
                    int totalMenoresACargo = 0;
                    List<String> nomeMenor = new ArrayList<>();
                    for (EncarregadoEducacao encarregado : encarregadosEducacao) {
                        for (Menor menor : listaMenores) {
                            if (encarregado.getNome().equals(menor.getEncEdu().getNome())) {
                                menor.getEncEdu().setMenoresACargo(++totalMenoresACargo);
                                nomeMenor.add(menor.getNome());
                                encarregado.setNomeMenor(nomeMenor);
                            }
                        }
                        encarregado.listaEncarregadosEducacao();
                        totalMenoresACargo = 0;
                        nomeMenor.clear();
                    }
                    break;
/*==============================================================================================================*/                
                case 6://MENSALIDADE JOVEM
                    System.out.println("\n");
                    System.out.println("|==================================|");
                    System.out.println(
                            "| Total mensalidade Jovens " + Utilitarios.totalMensalidadeJovem(listaMenores, listaAdultos) + "  |");
                    System.out.println("|==================================|");
                    break;
/*==============================================================================================================*/
                case 7://MENSALIDADE SENIOR
                    System.out.println("\n");
                    System.out.println("|==================================|");
                    System.out.println(
                            "| Total mensalidade Senior " + Utilitarios.totalMensalidadeSenior(listaSeniores) + "   |");
                    System.out.println("|==================================|");
                    break;
/*==============================================================================================================*/
                case 8://MENSALIDADE TOTAL
                    System.out.println("\n");
                    System.out.println("|==================================|");
                    System.out.println(
                            "| Total mensalidade Socios: " + (Utilitarios.totalMensalidadeJovem(listaMenores, listaAdultos) + Utilitarios.totalMensalidadeSenior(listaSeniores)) + " |");
                    System.out.println("|==================================|");
                    break;
/*==============================================================================================================*/
                case 9://PERCENTAGEM DA MENSALIDADE
                    System.out.println("\n");
                    System.out.println("|==================================|");
                    System.out.println(
                            "| Peso faturação Jovem: " + Utilitarios.percentagemMensalidadeJovem(listaMenores, listaAdultos, listaSeniores) + "%      |");
                    System.out.println(
                            "| Peso faturação Senior: " + Utilitarios.percentagemMensalidadeSenior(listaMenores, listaAdultos, listaSeniores) + "%     | ");
                    System.out.println("|==================================|");
                    break;
/*==============================================================================================================*/
                default:
                    if (opcao == 0) {
                        System.out.println("|        OPERACAO TERMINADA.       |");
                        System.out.println("|==================================|");
                        break;
                    } else {
                        System.out.println("|          OPCAO INVALIDA.         |");
                        System.out.println("|==================================|");
                        break;
                    }
/*==============================================================================================================*/
            }
            System.out.println();
            System.out.println();
        } while (opcao != 0);
        
        System.out.println();
        sc.close();
    }

}
