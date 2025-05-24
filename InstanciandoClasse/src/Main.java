import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo tx = new Triangulo();
        Triangulo ty = new Triangulo();
        System.out.println("Entre com as medidas do triângulo X:");
        tx.setA(sc.nextDouble());
        tx.setB(sc.nextDouble());
        tx.setC(sc.nextDouble());

        System.out.println("Entre com as medidas do triângulo Y:");
        ty.setA(sc.nextDouble());
        ty.setB(sc.nextDouble());
        ty.setC(sc.nextDouble());

        double areax = tx.cacularArea();
        double areay = ty.cacularArea();
        System.out.printf("Area Trinagulo X: " + "%.4f%n", areax);
        System.out.printf("Area Trinagulo Y: " + "%.4f%n", areay);

        if(areax > areay) {
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }
    }
}