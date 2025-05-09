import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
            - todos os números pares
            - a quantidade de números pares
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double[] pares = new double[n];
        int contagem = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++){
            if(vetor[i] % 2 == 0){
                pares[i] = vetor[i];
                System.out.print(pares[i] + " ");
                contagem++;
            }
        }

        System.out.println("Quantidade de números pares: " + contagem);
    }
}