package ufes.pss.gestaodefuncionarios.presenter;

import java.awt.event.ActionEvent;
import ufes.pss.gestaodefuncionarios.view.SistemaDeLogsView;

public class SistemaDeLogsPresenter {

    private SistemaDeLogsView view;

    public SistemaDeLogsPresenter(PrincipalPresenter principal) {
        view = new SistemaDeLogsView();
        principal.getView().getDesktop().add(view);

        view.getRbtTXT().setSelected(true);

        view.getBtnSalvar().addActionListener((ActionEvent ae) -> {
            if (view.getRbtTXT().isSelected()) {
                setTXT();
            } else if (view.getRbtJSON().isSelected()) {
                setJSON();
            }
        });

        view.setVisible(true);
    }

    private void setJSON() {
        System.out.println("Seta o sistema de logs para JSON");

        view.dispose();
    }

    private void setTXT() {
        System.out.println("Seta o sistema de logs para TXT");

        view.dispose();
    }

}
