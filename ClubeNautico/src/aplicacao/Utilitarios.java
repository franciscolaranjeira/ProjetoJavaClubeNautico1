package aplicacao;

import entidades.Adulto;
import entidades.Menor;
import entidades.Senior;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Utilitarios {

    static Scanner sc = new Scanner(System.in);
    private LocalDate data = LocalDate.now();
    public int ano = data.getYear();

/*=============================================================================*/      
    public static boolean validacaoTexto(String input) {
        boolean eTexto = false;
        if (input.matches("[a-zA-Z\\s\'\"]+")) {
            eTexto = true;
        } else {
            System.out.println("|==================================|");
            System.out.println("| Erro: Não introduziu um nome     |\n"
                             + "| valido, tente  novamente!        |");
            System.out.println("|==================================|");
            eTexto = false;
            }
       return eTexto;
    }
/*=============================================================================*/  
    public static String primeiraLetraMaiusculas(String frase) {
        frase = " " + frase;
        String f = "";
        for (int i = 0; i < frase.length(); i++) {
            char ch = frase.charAt(i);
            if (ch == ' ') {
                f = f + ch;
                i++;
                ch = frase.charAt(i);
                f = f + Character.toUpperCase(ch);
            } else {
                f = f + ch;
            }
        }
        frase = f.trim();
        return frase;
    }
/*=============================================================================*/  
    public static boolean validacaoDirigente(String input) {
        boolean eDirigente = false;
        
            if (input.matches("[a-zA-Z\\s\'\"]+")) {
                if (input.equalsIgnoreCase("S")) {
                    input = "S";
                    eDirigente = true;
                } else if (input.equalsIgnoreCase("N")) {
                    input = "N";
                    eDirigente = true;
                } else {
                    System.out.println("|==================================|");
                    System.out.println("| Erro: Insira (S) para dirigente  |\n"
                                     + "| ou (N) se não for dirigente!     |");
                    System.out.println("|==================================|");
                    System.out.print("| ");
                    eDirigente = false;
                    
                }               
            } else {
                System.out.println("|==================================|");
                System.out.println("| Erro: Não introduziu um caracter |\n"
                                 + "| valido, tente novamente!         |");
                System.out.println("|==================================|");
                System.out.print("| ");
            }
        return eDirigente;
    }
/*=============================================================================*/  
    public static int validaNif(int nif) {

        nif = 0;
        boolean isNumber;
        do {
            if (sc.hasNextInt()) {
                nif = sc.nextInt();
                isNumber = false;
                String number = String.valueOf(nif);
                if (number.length() == 9) {
                    nif = Integer.parseInt(number);
                    isNumber = false;
                } else {
                    System.out.println("|==================================|");
                    System.out.println("| Erro: Numero que introduziu não  |\n"
                                     + "| tem 9 digitos, tente novamente!  |");
                    System.out.println("|==================================|");
                    System.out.print("| ");
                    isNumber = true;
                }
            } else {
                System.out.println("|==================================|");
                System.out.println("| Erro: Não introduziu um numero   |\n"
                                 + "| valido, tente novamente!         |");
                System.out.println("|==================================|");
                System.out.print("| ");
                isNumber = true;
                sc.next();
            }
        } while (isNumber);
        return nif;
    }
/*=============================================================================*/  
    public static int valicacaoInteiro(int input) {
        input = 0;
        boolean isNumber;
        do {
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                isNumber = true;
            } else {
                System.out.println("|==================================|");
                System.out.println("| Erro: Não introduziu um numero   |\n"
                                 + "| valido, tente novamente!         |");
                System.out.println("|==================================|");
                System.out.print("| ");
                isNumber = false;
                sc.next();
            }
        } while (!(isNumber));
        return input;
    }
/*=============================================================================*/  
    public int validarAnoNascimento(int input){
        input = 0;
        boolean isNumber;
        do {
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                
                String ano1 = String.valueOf(input);
                        
                        if (input < ano - 3  && input >= ano - 120) {
                         input = Integer.parseInt(ano1);
                            isNumber = false;
                        } else {
                            System.out.println("|==================================|");
                            System.out.println("| Erro: O ano que inseriu não é    |\n"
                                             + "| valido, tente novamente!         |");
                            System.out.println("|==================================|");
                              System.out.print("| ");
                            isNumber = true;
                        }
               
            } else {
                System.out.println("|==================================|");
                System.out.println("| Erro: Não introduziu um numero   |\n"
                                 + "| valido, tente novamente!         |");
                System.out.println("|==================================|");
                  System.out.print("| ");
                isNumber = true;
                sc.next();
            }
        } while (isNumber);
        return input;
    }
/*=============================================================================*/  
    public static double totalMensalidadeJovem(List<Menor> listaMenores, List<Adulto> listaAdultos) {

        double totalMenor = 0;
        double totalAdulto = 0;

        for (Menor listaMenore : listaMenores) {
            totalMenor += listaMenore.calcularMensalidade();
        }
        for (Adulto listaAdulto : listaAdultos) {
            totalAdulto += listaAdulto.calcularMensalidade();
        }
        double totalJovem = totalMenor + totalAdulto;

        return totalJovem;
    }
/*=============================================================================*/  
    public static double totalMensalidadeSenior(List<Senior> listaSeniores) {
        double totalSenior = 0;

        for (Senior listaSenior : listaSeniores) {
            totalSenior += listaSenior.calcularMensalidade();
        }

        return totalSenior;
    }
/*=============================================================================*/  
    public static double percentagemMensalidadeJovem(List<Menor> listaMenores, List<Adulto> listaAdultos, List<Senior> listaSeniores) {
        

        double percentagemJovem = Math.round((totalMensalidadeJovem(listaMenores, listaAdultos) * 100) / (totalMensalidadeJovem(listaMenores, listaAdultos) 
                + totalMensalidadeSenior(listaSeniores)));
        return percentagemJovem;
    }
/*=============================================================================*/  
    public static double percentagemMensalidadeSenior(List<Menor> listaMenores, List<Adulto> listaAdultos, List<Senior> listaSeniores) {
        

        double percentagemSenior = Math.round((totalMensalidadeSenior(listaSeniores) * 100) / (totalMensalidadeJovem(listaMenores, listaAdultos) 
                + totalMensalidadeSenior(listaSeniores)));
        return percentagemSenior;
    }
/*=============================================================================*/  
}