import Entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Adione um produto:");
        String nome = sc.nextLine();
        System.out.print("Preço:");
        double preco = sc.nextDouble();
        System.out.print("Quantidade:");
        int quantidade = sc.nextInt();
        Produto produto = new Produto(nome, preco, quantidade);
        System.out.println(" ");
        System.out.println("Dados do produto: " + produto);
        System.out.println(" ");
        System.out.println("Deseja alguma operação? (s/n)");
        char resp = sc.next().charAt(0);
        System.out.println(" ");
        if(resp == 's') {
            while(resp == 's') {
                System.out.println(" ");
                System.out.println("Escolha uma opção:");
                System.out.print("1 - Adicionar produtos | ");
                System.out.println("2 - Remover produtos");
                int opcao = sc.nextInt();
                if(opcao == 1) {
                    System.out.println(" ");
                    System.out.print("Quantidade a adicionar: ");
                    int qtd = sc.nextInt();
                    produto.adicionarProdutos(qtd);
                } else if(opcao == 2) {
                    System.out.print("Quantidade a remover: ");
                    int qtd = sc.nextInt();
                    produto.removerProdutos(qtd);
                } else {
                    System.out.println("Opção inválida.");
                }
                System.out.println("Dados atualizados: " + produto);
                System.out.println("Deseja continuar? (s/n)");
                resp = sc.next().charAt(0);
            }
        }
        System.out.println(" ");
        System.out.println("Dados finais: " + produto);
        System.out.println("Fim do programa.");
    }
}