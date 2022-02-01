package ufes.pss.gestaodefuncionarios.presenter;

import ufes.pss.gestaodefuncionarios.view.CalcularSalarioView;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import ufes.pss.gestaodefuncionarios.collection.FuncionarioCollection;
import ufes.pss.gestaodefuncionarios.model.Funcionario;

public class CalcularSalarioPresenter {

    private CalcularSalarioView view;
    private DefaultTableModel tmFuncionarios;

    public CalcularSalarioPresenter(PrincipalPresenter principal, FuncionarioCollection funcionarios) {
        view = new CalcularSalarioView();
        principal.getView().getDesktop().add(view);

        tmFuncionarios = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Funcionario", "Data", "Salário Base (R$)", "Bônus (R$)", "Salário (R$)"}
        ) {
            @Override
            public boolean isCellEditable(final int row, final int column) {
                return false;
            }
        };

        for (Funcionario f : funcionarios.getFuncionarios()) {
            
            tmFuncionarios.addRow(new Object[]{
                f.getNome(),});
        }

        view.getTblFuncionarios().setModel(tmFuncionarios);

        view.getBtnFechar().addActionListener((ActionEvent ae) -> {
            fechar();
        });

        view.getBtnCalcular().addActionListener((ActionEvent ae) -> {
            calcular();
        });

        view.setVisible(true);
    }

    private void fechar() {
        view.dispose();
    }

    private void buscarData() {
        System.out.println("Falta implementar");
    }

    private void calcular() {
        System.out.println("Falta implementar");
    }

    private void listarTodos() {
        tmFuncionarios.setRowCount(0);
        view.getTblFuncionarios().setModel(tmFuncionarios);

    }
}
