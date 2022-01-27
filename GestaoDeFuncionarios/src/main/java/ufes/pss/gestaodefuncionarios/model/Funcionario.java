package ufes.pss.gestaodefuncionarios.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Funcionario implements Serializable, Comparable<Funcionario> {

    private String nome;
    private int idade;
    private double salario;
    private String cargo;
    private ArrayList<Bonus> bonusRecebidos;
    private boolean funcionarioDoMes;
    private int numFaltas;
    private LocalDate admissao;

    public Funcionario(String nome, int idade, double salario, String cargo, ArrayList<Bonus> bonus,
            boolean funcionarioDoMes, int numFaltas, LocalDate admissao) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
        this.setCargo(cargo);
        this.setBonus(bonus);
        this.setFuncionarioDoMes(funcionarioDoMes);
        this.setNumFaltas(numFaltas);
        this.setAdmissao(admissao);
    }

    public void addBonus(Bonus bonusRecebido) {
        bonusRecebidos.add(bonusRecebido);
    }

    public LocalDate getAdmissao() {
        return admissao;
    }

    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao;
    }

    public int getNumFaltas() {
        return numFaltas;
    }

    public void setNumFaltas(int numFaltas) {
        this.numFaltas = numFaltas;
    }

    public boolean isFuncionarioDoMes() {
        return funcionarioDoMes;
    }

    public void setFuncionarioDoMes(boolean funcionarioDoMes) {
        this.funcionarioDoMes = funcionarioDoMes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Bonus> getBonus() {
        return bonusRecebidos;
    }

    public void setBonus(ArrayList<Bonus> bonus) {
        this.bonusRecebidos = bonus;
    }

    @Override
    public int compareTo(Funcionario outro) {
        return this.getNome().compareToIgnoreCase(outro.getNome());
    }

}
