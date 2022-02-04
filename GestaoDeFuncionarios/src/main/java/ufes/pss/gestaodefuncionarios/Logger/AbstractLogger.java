package ufes.pss.gestaodefuncionarios.Logger;

import java.util.ArrayList;

public abstract class AbstractLogger {

    private String fileName;

    public AbstractLogger(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public abstract void logCRUDFuncionario(String nome, String operacao);

    public abstract void logConsultaBonus(String nome);

    public abstract void logCalculaSalario(ArrayList<String> funcionariosCalculados);

    public abstract void logFalha(String operacao, String excesao);

}
