import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /*
            Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida,
            mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas
            decimais, conforme exemplo.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--> Medidas do retangulo <--");
        System.out.println(" ");
        System.out.print("Informe as medidas da base: ");
        double base = sc.nextDouble();
        System.out.print("Informe as medidas da altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = (2 * base) + (2 * altura);
        double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.println("=== Resultados ===");
        System.out.println(" ");
        System.out.printf("AREA: " + "%.4f%n", area);
        System.out.printf("PERIMETRO: " + "%.4f%n", perimetro);
        System.out.printf("DIAGONAL: " + "%.4f%n", diagonal);
    }
}