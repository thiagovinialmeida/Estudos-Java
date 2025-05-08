import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o
            menor dentre os três números lidos. Em caso de empate, mostrar apenas uma vez.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("--> Qual número é maior? <--");
        System.out.println("Insira três números:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.println("MENOR = " + num1);
        } else if (num2 < num1 && num2 < num3){
            System.out.println("MENOR = " + num2);
        } else if (num3 < num1 && num3 < num2){
            System.out.println("MENOR = " + num3);
        } else {
            System.out.println("MENOR = " + num1);
        }
    }
}