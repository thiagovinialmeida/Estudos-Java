import Domain.Contrato;
import Domain.Enums.Nivel;
import Domain.Funcionario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.print("Informações do funcionário:\n");
        System.out.print("Nome: ");
        String nomeFuncionario = sc.nextLine();
        System.out.print("Nível (JUNIOR, PLENO, SENIOR): ");
        String nivel = sc.nextLine().toUpperCase();
        System.out.print("Salário base: ");
        Double salarioBase = sc.nextDouble();
        Funcionario funcionario = new Funcionario(nomeFuncionario, Nivel.valueOf(nivel), salarioBase);

        // Criação do contrato
        System.out.println(" ");
        System.out.print("Quantos contratos para este funcionário? ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(" ");
            System.out.println("Contrato #" + (i + 1) + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            LocalDate data = LocalDate.parse(sc.next(), dtf);
            System.out.print("Valor por hora: ");
            Double valorPorHora = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int horas = sc.nextInt();

            Contrato contrato = new Contrato(data, valorPorHora, horas);
            funcionario.AdicionarContrato(contrato);
        }

        System.out.println(" ");
        System.out.print("Informe o mês e o ano para calcular a renda (MM/YYYY): ");
        String mesAno = sc.next();
        String[] partes = mesAno.split("/");
        int mes = Integer.parseInt(partes[0]);
        int ano = Integer.parseInt(partes[1]);
        Double renda = funcionario.Renda(mes, ano);
        System.out.printf("Nome: " + funcionario.getNome() + "\n");
        System.out.printf("Departamento: " + nomeDepartamento + "\n");
        System.out.printf("Renda em " + mes + "/" + ano + ": " + ("%.2f%n"), renda);
    }
}