package ufes.pss.gestaodefuncionarios.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bonus {

    private String nome;
    private LocalDate data;
    private double valor;

    public Bonus(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.data = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setData(String data) {
        try {
            this.data = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (Exception e) {
            throw new RuntimeException("Erro ao validar data!");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
