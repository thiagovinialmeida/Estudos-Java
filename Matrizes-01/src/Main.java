import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Fazer um programa para ler um número inteiro N e uma matriz quadrada de ordem N
            contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade
            de valores negativos da matriz.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de linhas e colunas:");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        int negativos = 0;

        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL: ");
        for(int i = 0;i < n;i++){
            System.out.print(matriz[i][i] + " ");

            for(int x = 1;x < n;x++){
                if(matriz[i][x] <= -1){
                    negativos++;
                }
            }
        }
        System.out.println();
        System.out.println("NEGATIVOS: " + negativos);
    }
}