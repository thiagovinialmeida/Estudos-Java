import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
            segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final que o
            aluno obteve no ano juntamente com um texto explicativo. Caso a nota final do aluno
            seja inferior a 60.00, mostrar a mensagem "REPROVADO", conforme exemplos. Todos
            os valores devem ter uma casa decimal.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--> Calculo de Notas <--");
        System.out.println();
        System.out.print("Insira sua nota do primeiro semestre: ");
        double primeiroSE = sc.nextDouble();
        System.out.print("Insira sua nota do segundo semestre: ");
        double segundoSE = sc.nextDouble();

        double res = primeiroSE + segundoSE;

        System.out.println(" ");
        if(res >= 60.00){
            System.out.printf("NOTA FINAL: %.1f%n", res);
            System.out.println("APROVADO!");
        } else {
            System.out.printf("NOTA FINAL: %.1f%n", res);
            System.out.println("REPROVADO!");
        }
    }
}