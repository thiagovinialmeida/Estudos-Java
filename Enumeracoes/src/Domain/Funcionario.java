package Domain;

import Domain.Enums.Nivel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String Nome;
    private Nivel NivelExperiencia;
    private Double SalarioBase;
    private List<Contrato> contratos = new ArrayList<>();

    public Funcionario(String nome, Nivel nivelExperiencia, Double salarioBase) {
        Nome = nome;
        NivelExperiencia = nivelExperiencia;
        SalarioBase = salarioBase;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Nivel getNivelExperiencia() {
        return NivelExperiencia;
    }

    public void setNivelExperiencia(Nivel nivelExperiencia) {
        NivelExperiencia = nivelExperiencia;
    }

    public Double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        SalarioBase = salarioBase;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

    public void AdicionarContrato(Contrato contrato){
        contratos.add(contrato);
    }
    public void RemoverContrato(Contrato contrato){
        contratos.remove(contrato);
    }
    public Double Renda(int mes, int ano) {
        double soma = SalarioBase;
        for(Contrato C : contratos){
            LocalDate dataContrato = C.getData();
            int C_ano = dataContrato.getYear();
            int C_mes = dataContrato.getMonthValue();
            if(C_mes == mes && C_ano == ano){
                soma += C.ValorTotal();
            }
        }
        return soma;
    }
}
