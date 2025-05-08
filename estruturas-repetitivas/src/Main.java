import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Faça um programa para ler um número indeterminado de dados, contendo cada um, a
            idade de um indivíduo. O último dado, que não entrará nos cálculos, contém um valor
            de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos. Se for
            entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int contador = 0;

        System.out.print("Digite a idade: ");
        int resp = sc.nextInt();
        if(resp >= 0){
            while(resp >= 0){
                total += resp;
                contador++;
                System.out.print("Digite a idade: ");
                resp = sc.nextInt();
            }

            double media = (double) total / contador;
            System.out.printf("Média: %.2f%n", media);
        } else {
            System.out.println("Impossível calcular");
        }
    }
}