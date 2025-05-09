import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
            do vetor (supor não haver empates). Mostrar também a posição do maior elemento.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        double maior = 0;
        int posicaoMaior = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.println("O maior número é: " + maior + ". Encontrado na posição: " + posicaoMaior);
    }
}