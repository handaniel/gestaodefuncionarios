package com.pss.gestaodefuncionarios.presenter;

import com.pss.gestaodefuncionarios.view.CalcularSalarioView;
import com.pss.gestaodefuncionarios.view.PrincipalView;
import java.awt.event.ActionEvent;

public class CalcularSalarioPresenter {

    private CalcularSalarioView view;

    public CalcularSalarioPresenter(PrincipalView principal) {
        view = new CalcularSalarioView();
        principal.getDesktop().add(view);
        view.setVisible(true);

        view.getBtnFechar().addActionListener((ActionEvent ae) -> {
            fechar();
        });

        view.getBtnBuscarData().addActionListener((ActionEvent ae) -> {
            buscarData();
        });

        view.getBtnCalcular().addActionListener((ActionEvent ae) -> {
            calcular();
        });

        view.getBtnListarTodos().addActionListener((ActionEvent ae) -> {
            listarTodos();
        });

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
        System.out.println("Falta implementar");
    }
}
