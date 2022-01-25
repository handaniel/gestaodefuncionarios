package ufes.pss.gestaodefuncionarios.presenter;

import ufes.pss.gestaodefuncionarios.view.BuscarFuncionarioView;
import ufes.pss.gestaodefuncionarios.view.PrincipalView;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class BuscarFuncionarioPresenter {

    private BuscarFuncionarioView view;
    private DefaultTableModel tmFuncionarios;

    public BuscarFuncionarioPresenter(PrincipalView principal) {
        view = new BuscarFuncionarioView();
        principal.getDesktop().add(view);

        tmFuncionarios = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "Nome", "Idade", "Função", "Salário base (R$)"}
        ) {
            @Override
            public boolean isCellEditable(final int row, final int column) {
                return false;
            }
        };
        view.getTblFuncionarios().setModel(tmFuncionarios);

        view.getBtnFechar().addActionListener((ActionEvent ae) -> {
            fechar();
        });

        view.getBtnBusca().addActionListener((ActionEvent ae) -> {
            buscar();
        });

        view.getBtnNovo().addActionListener((ActionEvent ae) -> {
            novo();
        });

        view.getBtnBonus().addActionListener((ActionEvent ae) -> {
            bonus();
        });

        view.getBtnVisualizar().addActionListener((ActionEvent ae) -> {
            visualizar();
        });

        view.setVisible(true);
    }

    private void fechar() {
        view.dispose();
    }

    private void buscar() {
        System.out.println("Falta implementar");
    }

    private void novo() {
        System.out.println("Falta implementar");
    }

    private void bonus() {
        System.out.println("Falta implementar");
    }

    private void visualizar() {
        System.out.println("Falta implementar");
    }

}
