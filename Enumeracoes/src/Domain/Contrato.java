package Domain;

import java.time.LocalDate;

public class Contrato {
    private LocalDate Data;
    private Double ValorPorHora;
    private Integer Horas;

    public Contrato(LocalDate data, Double valorPorHora, Integer horas) {
        Data = data;
        ValorPorHora = valorPorHora;
        Horas = horas;
    }

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }

    public Double getValorPorHora() {
        return ValorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        ValorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return Horas;
    }

    public void setHoras(Integer horas) {
        Horas = horas;
    }

    public double ValorTotal() {
        return ValorPorHora * Horas;
    }
}
