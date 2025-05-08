/*
    Fazer um programa para ler as medidas da largura e comprimento de um terreno
    retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
    com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
    terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,
    conforme exemplo.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--> Calculo de terreno <--");
        System.out.println(" ");
        System.out.print("Informe a largura do terreno:");
        double largura = sc.nextDouble();
        System.out.print("Informe o comprimento do terreno:");
        double comprimento = sc.nextDouble();
        System.out.print("Informe o valor por metro quadrado:");
        double valor = sc.nextDouble();

        double resArea = largura * comprimento;
        double resValor = resArea * valor;

        System.out.printf("AREA: " + "%.2f%n", resArea);
        System.out.printf("VALOR: R$" + "%.2f%n", resValor);
    }
}