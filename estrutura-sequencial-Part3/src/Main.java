import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /*
            Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas.
            Ao final mostrar uma mensagem com os nomes e a idade média entre essas pessoas,
            com uma casa decimal, conforme exemplo.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("--> Idade média <--");
        System.out.println(" ");
        System.out.print("Insira um nome: ");
        String primeiroNome = sc.next();
        System.out.printf("Insira a idade de %s: ", primeiroNome);
        int primeiraIdade = sc.nextInt();
        System.out.print("Insira outro nome: ");
        String segundoNome = sc.next();
        System.out.printf("Insira a idade de %s: ", segundoNome);
        int segundaIdade = sc.nextInt();

        double media = (double) (primeiraIdade + segundaIdade) / 2;

        System.out.printf("A idade média de %s e %s é de: %.1f", primeiroNome, segundoNome, media);
    }
}