import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Fazer um programa para ler dois números inteiros M e N. Em seguida, ler uma matriz
            de M linhas e N colunas contendo números double. Gerar um vetor de modo que cada
            elemento do vetor seja a soma dos elementos da linha correspondente da matriz.
            Mostrar o vetor gerado.

            2 3
            7.0 8.0 10.0
            2.0 3.0 5.0
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("======================================================================");
        System.out.println(" ");
        System.out.println("Delimite o tamanho da matriz");
        System.out.print("Largura: ");
        int larguraMatriz = sc.nextInt();
        System.out.print("Comprimento: ");
        int comprimentoMatriz = sc.nextInt();
        System.out.println(" ");

        double[][] matriz = new double[larguraMatriz][comprimentoMatriz];
        double[] vetor = new double[larguraMatriz];


        System.out.println("======================================================================");
        System.out.println(" ");
        for (int i = 0; i < larguraMatriz; i++){
            for (int j = 0; j < comprimentoMatriz; j++){
                System.out.print("Adicione o " + (j + 1) + "º" + " elemento da linha " + (i + 1) + ": ");
                matriz[i][j] = sc.nextDouble();
                sc.nextLine();
            }
            System.out.println(" ");
            System.out.println("======================================================================");
            System.out.println(" ");
        }

        for(int x = 0; x < larguraMatriz; x++){
            for(int y = 0; y < comprimentoMatriz; y++){
                vetor[x] += matriz[x][y];
            }
            System.out.printf("Soma linha " + (x + 1) + ": " + "%.1f%n", vetor[x]);
        }
        System.out.println(" ");
        System.out.println("======================================================================");
    }
}