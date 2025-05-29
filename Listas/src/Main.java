import Entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUantos funcionarios vão ser registrados? ");
        int n = sc.nextInt();

        List<Funcionario> Funclista = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id, nome, salario);
            System.out.println(" ");
            Funclista.add(funcionario);
        }

        System.out.print("Digite o ID do funcionario que terá o salario aumentado: ");
        int id = sc.nextInt();
        Funcionario funcAumento = Funclista.stream().filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
        System.out.print("Digite a porcentagem: ");
        funcAumento.aumentarSalario(sc.nextDouble());

        System.out.println(" ");
        for (Funcionario func : Funclista) {
            System.out.println(func);
        }
    }
}