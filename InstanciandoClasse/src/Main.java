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

        double pX = (tx.getA() + tx.getB() + tx.getC()) / 2;
        double pY = (ty.getA() + ty.getB() + ty.getC()) / 2;

        double areax = Math.sqrt(pX *(pX - tx.getA())*(pX - tx.getB())*(pX - tx.getC()));
        double areay = Math.sqrt(pY *(pY - ty.getA())*(pY - ty.getB())*(pY - ty.getC()));

        System.out.println("Area Trinagulo X: " + String.format("%.4f", areax));
        System.out.println("Area Trinagulo Y: " + String.format("%.4f", areay));

        if(areax > areay) {
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }
    }
}