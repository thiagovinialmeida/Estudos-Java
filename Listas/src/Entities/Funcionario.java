package Entities;

public class Funcionario {
    int id;
    String nome;
    int salario;

    public Funcionario(int id, String nome, double salary) {
        this.id = id;
        this.nome = nome;
        this.salario = (int) salary * 100;  // Convertendo para centavos para melhor precisão
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return (double) salario / 100;  // Convertendo de volta para reais
    }
    public void setSalario(double salario) {
        this.salario = (int) salario * 100;  // Convertendo para centavos para melhor precisão
    }

    public void aumentarSalario(double porcentagem) {
        Long tempo = System.nanoTime();
        double valor = salario + salario * porcentagem / 100;
        salario = (int) valor;
        System.out.println("Salario atualizado com sucesso! " + (System.nanoTime() - tempo) + "ns");
    }

    @Override
    public String toString() {
        double salario = (double) this.salario / 100;
        return id + " - " + nome + " - R$" + String.format("%.2f", salario);
    }
}
