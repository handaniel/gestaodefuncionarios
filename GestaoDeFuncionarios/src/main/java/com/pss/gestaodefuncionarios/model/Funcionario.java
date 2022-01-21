package com.pss.gestaodefuncionarios.model;

public class Funcionario {
    
    private String nome;
    private int idade;
    private double salario;
    private String cargo;
    private double bonus;
    
    public Funcionario(String nome, int idade, double salario, String cargo, double bonus) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
        this.setCargo(cargo);
        this.setBonus(bonus);
    }
    
    public String getNome() {
        return nome;
    }
    
    private void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    private void setIdade(int idade) {
        this.idade = idade;
    }
    
    public double getSalario() {
        return salario;
    }
    
    private void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    private void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getBonus() {
        return bonus;
    }
    
    private void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
}
