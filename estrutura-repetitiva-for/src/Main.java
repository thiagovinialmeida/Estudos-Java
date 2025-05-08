import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
            Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
            programa.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("--> Calculando Fahrenheit <--");
        for(char resp = 's'; resp != 'n' ;){
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = ((celsius * 9.0) / 5.0) + 32.0;
            System.out.printf("Temperatura em Fahrenheit: %.1f%n", fahrenheit);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);

            if(resp != 's' && resp != 'n'){
                while(resp != 's' && resp != 'n'){
                    System.out.print("Opção inválida. Tente (s/n):");
                    resp = sc.next().charAt(0);
                }
            }
        }
        System.out.println("Programa encerrado.");
    }
}