package com.pss.gestaodefuncionarios.presenter;

import com.pss.gestaodefuncionarios.view.PrincipalView;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class PrincipalPresenter {

    private static PrincipalView view;

    public static void main(String[] args) {

        inicializa();

    }

    public static void inicializa() {

        view = new PrincipalView();
        view.setVisible(true);

        view.getBtnAddFuncionario().addActionListener(((ActionEvent ae) -> {
            addFuncionario();
        }));

        view.getBtnBuscarFuncionario().addActionListener((ActionEvent ae) -> {
            buscarFuncionario();
        });

        view.getBtnCalcularSalario().addActionListener((ActionEvent ae) -> {
            calcularSalario();
        });

        view.getBtnAlterarLogs().addActionListener((ActionEvent ae) -> {
            alterarLogs();
        });

        view.getBtnInfoSistema().addActionListener((ActionEvent ae) -> {
            informacoesDoSistema();
        });

    }

    private static void addFuncionario() {
        new ManterFuncionarioPresenter(view);
    }

    private static void buscarFuncionario() {
        new BuscarFuncionarioPresenter(view);
    }

    private static void calcularSalario() {
        new CalcularSalarioPresenter(view);
    }

    private static void alterarLogs() {
        new SistemaDeLogsPresenter(view);
    }

    private static void informacoesDoSistema() {
        String info = "Informações do sistema:\n"
                + "Versão: x.x\n"
                + "Persistência de Dados: Serialização\n"
                + "Número de funcionários cadastrados: x";
        JOptionPane.showMessageDialog(view, info, "Informações do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }
}
