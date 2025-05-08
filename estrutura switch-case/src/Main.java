import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Fazer um programa para ler um valor inteiro de 1 a 7 representando um
            dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
            Escrever na tela o dia da semana correspondente, conforme exemplos.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("--> Dia da Semana <--");
        System.out.println(" ");
        System.out.print("Veja qual dia da semana corresponde ao número de 1 á 7: ");
        int resp = sc.nextInt();

        String dia;
        switch(resp){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-Feira";
                break;
            case 3:
                dia = "Terça-Feira";
                break;
            case 4:
                dia = "Quarta-Feira";
                break;
            case 5:
                dia = "Quinta-Feira";
                break;
            case 6:
                dia = "Sexta-Feira";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Valor invalido. Insira um número de 1 á 7 somente.";
        }

        System.out.println("Dia da semana: " + dia);
    }
}