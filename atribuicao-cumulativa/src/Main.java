import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
            dá direito a 100 minutos de telefone. Cada minuto que exceder a
            franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
            quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
            a ser pago.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("--> Calculadora de consumo <--");
        System.out.println(" ");
        System.out.print("Minutos utilizados: ");
        int minutos = sc.nextInt();
        double total = 50.00;

        System.out.println(" ");
        if(minutos < 100){
            System.out.printf("Valor a pagar: R$%.2f", total);
        } else {
            total += (minutos - 100) * 2;
            System.out.printf("Valor a pagar: R$%.2f", total);
        }
    }
}