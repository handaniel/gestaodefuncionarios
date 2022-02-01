package ufes.pss.gestaodefuncionarios.presenter;

import ufes.pss.gestaodefuncionarios.view.SistemaDeLogsView;
import java.awt.event.ActionEvent;

public class SistemaDeLogsPresenter {

    private SistemaDeLogsView view;

    public SistemaDeLogsPresenter(PrincipalPresenter principal) {
        view = new SistemaDeLogsView();
        principal.getView().getDesktop().add(view);

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

}
