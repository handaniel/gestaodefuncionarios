package ufes.pss.gestaodefuncionarios.presenter;

import ufes.pss.gestaodefuncionarios.view.PrincipalView;
import ufes.pss.gestaodefuncionarios.view.ManterFuncionarioView;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import ufes.pss.gestaodefuncionarios.collection.FuncionarioCollection;
import ufes.pss.gestaodefuncionarios.model.Funcionario;
import ufes.pss.gestaodefuncionarios.utils.AddBonusRecebidosCadastro;

public class ManterFuncionarioPresenter {

    private ManterFuncionarioView view;
    private FuncionarioCollection funcionarios;

    public ManterFuncionarioPresenter(PrincipalView principal, FuncionarioCollection funcionarios) {
        this.funcionarios = funcionarios;

        view = new ManterFuncionarioView();
        principal.getDesktop().add(view);

        view.getBtnFechar().addActionListener((ActionEvent ae) -> {
            fechar();
        });

        view.getBtnEditar().addActionListener((ActionEvent ae) -> {
            editar();
        });

        view.getBtnSalvar().addActionListener((ActionEvent ae) -> {
            salvar();
        });

        view.getBtnExcluir().addActionListener((ActionEvent ae) -> {
            excluir();
        });

        view.setVisible(true);

    }

    private void fechar() {
        view.dispose();
    }

    private void editar() {
        System.out.println("Falta implementar");
    }

    private void salvar() {

        String nome = view.getTxtNome().getText();
        int idade = Integer.parseInt(view.getTxtIdade().getText());
        double salario = Double.parseDouble(view.getTxtSalario().getText().replace(",", "."));
        String cargo = view.getCbxCargo().getSelectedItem().toString();
        int numFaltas = Integer.parseInt(view.getTxtFaltas().getText());
        LocalDate admissao = LocalDate.parse(view.getTxtAdmissao().getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        boolean funcionarioDoMes = view.getCkbFuncionarioDoMes().isSelected();
        String formacao = view.getCbxFormacao().getSelectedItem().toString();
        String bonusInicial = view.getCbxBonus().getSelectedItem().toString();

        Funcionario f = new Funcionario(nome, idade, salario, cargo, numFaltas, admissao, funcionarioDoMes, formacao);

        AddBonusRecebidosCadastro.addBonusRecebidoCadastro(f, bonusInicial);

        funcionarios.addFuncionario(f);

    }

    private void excluir() {
        System.out.println("Falta implementar");
    }

}
