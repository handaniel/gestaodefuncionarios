package ufes.pss.gestaodefuncionarios.presenter;

import ufes.pss.gestaodefuncionarios.view.ManterFuncionarioView;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import ufes.pss.gestaodefuncionarios.collection.FuncionarioCollection;
import ufes.pss.gestaodefuncionarios.model.Bonus;
import ufes.pss.gestaodefuncionarios.model.Funcionario;
import ufes.pss.gestaodefuncionarios.utils.AddBonusRecebidosCadastro;

public class ManterFuncionarioPresenter {
    
    private final ManterFuncionarioView view;
    private final FuncionarioCollection funcionarios;
    
    public ManterFuncionarioPresenter(PrincipalPresenter principal, FuncionarioCollection funcionarios) {
        this.funcionarios = funcionarios;
        
        view = new ManterFuncionarioView();
        principal.getView().getDesktop().add(view);
        
        view.getBtnExcluir().setEnabled(false);
        view.getBtnEditar().setEnabled(false);
        
        view.getBtnFechar().addActionListener((ActionEvent ae) -> {
            fechar();
        });
        
        view.getBtnSalvar().addActionListener((ActionEvent ae) -> {
            salvar(principal);
        });
        
        view.setVisible(true);
        
    }
    
    public ManterFuncionarioPresenter(PrincipalPresenter principal,
            FuncionarioCollection funcionarios, Funcionario f) {
        
        this.funcionarios = funcionarios;
        
        view = new ManterFuncionarioView();
        principal.getView().getDesktop().add(view);
        
        preparaVisualizacao(f);
        
        view.getBtnFechar().addActionListener((ActionEvent ae) -> {
            fechar();
        });
        
        view.getBtnEditar().addActionListener((ActionEvent ae) -> {
            preparaEdicao(f);
        });
        
        view.getBtnExcluir().addActionListener((ActionEvent ae) -> {
            excluir(principal, f);
        });
        
        view.setVisible(true);
        
    }
    
    private void preparaEdicao(Funcionario f) {
        view.getTxtNome().setEditable(true);
        view.getTxtAdmissao().setEditable(true);
        view.getTxtSalario().setEditable(true);
        view.getTxtIdade().setEditable(true);
        view.getTxtFaltas().setEditable(true);
        view.getCbxCargo().setEditable(false);
        view.getCbxBonus().setEditable(false);
        view.getCbxFormacao().setEditable(false);
        view.getCkbFuncionarioDoMes().setFocusable(true);
        
        view.getBtnSalvar().setEnabled(true);
        view.getBtnExcluir().setEnabled(false);
        view.getBtnEditar().setEnabled(false);
        
        view.getBtnSalvar().addActionListener((ActionEvent ae) -> {
            editar(f);
        });
        
    }
    
    private void preparaVisualizacao(Funcionario f) {
        view.setTitle("Visualizacao");
        
        view.getTxtNome().setText(f.getNome());
        view.getTxtAdmissao().setText(f.getAdmissao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        view.getTxtSalario().setText(Double.toString(f.getSalario()).replace(".", ","));
        view.getTxtIdade().setText(Integer.toString(f.getIdade()));
        view.getTxtFaltas().setText(Integer.toString(f.getNumFaltas()));
        view.getCbxCargo().setSelectedIndex(view.indexOfCargo(f.getCargo()));
        for (Bonus b : f.getBonusRecebidos()) {
            if (b.getNome().equals("Normal") || b.getNome().equals("Generoso")) {
                view.getCbxBonus().setSelectedIndex(view.indexOfBonus(b.getNome()));
            }
        }
        view.getCbxFormacao().setSelectedIndex(view.indexOfFormacao(f.getFormacao()));
        view.getCkbFuncionarioDoMes().setSelected(f.isFuncionarioDoMes());
        
        view.getTxtNome().setEditable(false);
        view.getTxtAdmissao().setEditable(false);
        view.getTxtSalario().setEditable(false);
        view.getTxtIdade().setEditable(false);
        view.getTxtFaltas().setEditable(false);
        view.getCbxCargo().setEditable(false);
        view.getCbxBonus().setEditable(false);
        view.getCbxFormacao().setEditable(false);
        view.getCkbFuncionarioDoMes().setFocusable(false);
        
        view.getBtnSalvar().setEnabled(false);
        
    }
    
    private void fechar() {
        view.dispose();
    }
    
    private void editar(Funcionario f) {
        
        String nome = view.getTxtNome().getText();
        int idade = Integer.parseInt(view.getTxtIdade().getText());
        double salario = Double.parseDouble(view.getTxtSalario().getText().replace(",", "."));
        String cargo = view.getCbxCargo().getSelectedItem().toString();
        int numFaltas = Integer.parseInt(view.getTxtFaltas().getText());
        LocalDate admissao = LocalDate.parse(view.getTxtAdmissao().getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        boolean funcionarioDoMes = view.getCkbFuncionarioDoMes().isSelected();
        String formacao = view.getCbxFormacao().getSelectedItem().toString();
        String bonusInicial = view.getCbxBonus().getSelectedItem().toString();
        
        funcionarios.atualizarFuncionarioById(f.getId(), nome, idade, salario, cargo, numFaltas, admissao, funcionarioDoMes, formacao);
        
        f.setBonusRecebidos(new ArrayList<>());
        
        AddBonusRecebidosCadastro.addBonusRecebidoCadastro(f, bonusInicial);
        
        fechar();
    }
    
    private void salvar(PrincipalPresenter pp) {
        
        String nome = view.getTxtNome().getText();
        int idade = Integer.parseInt(view.getTxtIdade().getText());
        double salario = Double.parseDouble(view.getTxtSalario().getText().replace(",", "."));
        String cargo = view.getCbxCargo().getSelectedItem().toString();
        int numFaltas = Integer.parseInt(view.getTxtFaltas().getText());
        String admissao = view.getTxtAdmissao().getText();
        boolean funcionarioDoMes = view.getCkbFuncionarioDoMes().isSelected();
        String formacao = view.getCbxFormacao().getSelectedItem().toString();
        String bonusInicial = view.getCbxBonus().getSelectedItem().toString();
        int id = funcionarios.getFuncionarios().size() + 1;
        
        Funcionario f = new Funcionario(id, nome, idade, salario, cargo, numFaltas, admissao, funcionarioDoMes, formacao);
        
        AddBonusRecebidosCadastro.addBonusRecebidoCadastro(f, bonusInicial);
        
        funcionarios.addFuncionario(f);
        
        pp.updateNumFuncionarios();
        
        fechar();
        
    }
    
    private void excluir(PrincipalPresenter pp, Funcionario f) {
        
        funcionarios.getFuncionarios().remove(f);
        pp.updateNumFuncionarios();
        fechar();
    }
    
}
