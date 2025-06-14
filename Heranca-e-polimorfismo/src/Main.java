import Entities.Employee;
import Entities.Outsourcered;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Uma empresa possui funcionários próprios e terceirizados.
            Para cada funcionário, deseja-se registrar nome, horas
            trabalhadas e valor por hora. Funcionários terceirizado
            possuem ainda uma despesa adicional.
            O pagamento dos funcionários corresponde ao valor da hora
            multiplicado pelas horas trabalhadas, sendo que os
            funcionários terceirizados ainda recebem um bônus
            correspondente a 110% de sua despesa adicional.
            Fazer um programa para ler os dados de N funcionários (N
            fornecido pelo usuário) e armazená-los em uma lista. Depois
            de ler todos os dados, mostrar nome e pagamento de cada
            funcionário na mesma ordem em que foram digitados.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees to be registred: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(" ");
            System.out.print("It's outsourcered(y/n)? ");
            char resp = sc.next().charAt(0);
            System.out.println(" ");
            System.out.print("Enter the name of Employee: ");
            String name = sc.next();
            System.out.print("Enter the number of hours worked: ");
            int hours = sc.nextInt();
            System.out.print("Enter the value per hour worked: ");
            double valuePerHour = sc.nextDouble();

            if(Character.toLowerCase(resp) == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new Outsourcered(name, hours, valuePerHour, additionalCharge));
            } else if (Character.toLowerCase(resp) == 'n') {
                employees.add(new Employee(name, hours, valuePerHour));
            } else {
                System.out.println("Resposta invalida.");
                i--;
            }
        }
        System.out.println(" ");
        System.out.println("PAYMENTS");
        for(Employee employee : employees){
            System.out.printf(employee.getName() + " - $ " + "%.2f%n", employee.Payment());
        }
        System.out.println(" ");
        System.out.println("Program closed");
    }
}