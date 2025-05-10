import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde
            cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
            System.out.print(c[i] + " ");
        }
    }
}