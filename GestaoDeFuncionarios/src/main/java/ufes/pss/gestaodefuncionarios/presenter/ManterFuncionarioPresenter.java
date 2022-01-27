package ufes.pss.gestaodefuncionarios.presenter;

import ufes.pss.gestaodefuncionarios.view.PrincipalView;
import ufes.pss.gestaodefuncionarios.view.ManterFuncionarioView;
import java.awt.event.ActionEvent;

public class ManterFuncionarioPresenter {

    private ManterFuncionarioView view;

    public ManterFuncionarioPresenter(PrincipalView principal) {
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
        System.out.println(view.getCbxCargo().getSelectedItem());
        System.out.println(view.getCbxBonus().getSelectedItem());
        System.out.println(view.getCkbFuncionarioDoMes().isSelected());
    }

    private void excluir() {
        System.out.println("Falta implementar");
    }

}
