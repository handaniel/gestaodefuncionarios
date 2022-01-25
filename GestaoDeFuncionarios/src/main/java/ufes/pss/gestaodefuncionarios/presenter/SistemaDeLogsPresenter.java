package ufes.pss.gestaodefuncionarios.presenter;

import ufes.pss.gestaodefuncionarios.view.PrincipalView;
import ufes.pss.gestaodefuncionarios.view.SistemaDeLogsView;
import java.awt.event.ActionEvent;

public class SistemaDeLogsPresenter {

    private SistemaDeLogsView view;

    public SistemaDeLogsPresenter(PrincipalView principal) {
        view = new SistemaDeLogsView();
        principal.getDesktop().add(view);

        view.getBtnXML().addActionListener((ActionEvent ae) -> {
            setXML();
        });

        view.getBtnTXT().addActionListener((ActionEvent ae) -> {
            setTXT();
        });

        view.getBtnJSON().addActionListener((ActionEvent ae) -> {
            setJSON();
        });

        view.setVisible(true);
    }

    private void setXML() {
        System.out.println("Falta implementar");

        view.dispose();
    }

    private void setTXT() {
        System.out.println("Falta implementar");

        view.dispose();
    }

    private void setJSON() {
        System.out.println("Falta implementar");

        view.dispose();
    }

}
