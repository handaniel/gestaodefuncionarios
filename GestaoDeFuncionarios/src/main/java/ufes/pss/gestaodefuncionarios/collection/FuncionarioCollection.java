package ufes.pss.gestaodefuncionarios.collection;

import java.util.ArrayList;
import java.util.Collections;
import ufes.pss.gestaodefuncionarios.model.Funcionario;

public class FuncionarioCollection {

    private ArrayList<Funcionario> funcionarios;

    public FuncionarioCollection() {
        funcionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario funcionario) {
        if (funcionarios.contains(funcionario)) {
            throw new RuntimeException("Funcionário já cadastrado!");
        } else if (funcionario != null) {
            this.funcionarios.add(funcionario);
        } else {
            throw new RuntimeException("Forneça uma instância válida de funcionário");
        }
    }

    public void atualizarFuncionario(Funcionario antigo, Funcionario novo) {
        if (funcionarios.contains(novo)) {
            throw new RuntimeException("Funcionário já cadastrado");
        } else if (novo != null) {
            for (Funcionario f : funcionarios) {
                if (f.equals(antigo)) {
                    f.setNome(novo.getNome());
                    f.setCargo(novo.getCargo());
                    f.setIdade(novo.getIdade());
                    f.setSalario(novo.getSalario());
                    f.setBonusRecebidos(novo.getBonusRecebidos());
                }
            }
        }
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Funcionario findById(int id) {
        for (Funcionario f : this.getFuncionarios()) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    public void ordenar() {
        Collections.sort(funcionarios);
    }

}
