import Entities.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        System.out.println(" ");

        System.out.printf("Circumference: %.2f%n", Calculadora.circunferencia(raio));
        System.out.printf("Volume: %.2f%n", Calculadora.volume(raio));
        System.out.printf("PI value: %.2f%n", Calculadora.PI);
    }
}