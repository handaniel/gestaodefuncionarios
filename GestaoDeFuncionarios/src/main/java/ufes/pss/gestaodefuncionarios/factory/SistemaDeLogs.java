package ufes.pss.gestaodefuncionarios.factory;

import java.io.File;

import ufes.pss.gestaodefuncionarios.Logger.AbstractLogger;
import ufes.pss.gestaodefuncionarios.Logger.JSONLogger;
import ufes.pss.gestaodefuncionarios.Logger.TXTLogger;

public class SistemaDeLogs {

    private TXTLogger loggerTXT;
    private JSONLogger loggerJSON;
    private String tipo;

    public SistemaDeLogs(String tipo) {
        setTipo(tipo);
        this.loggerTXT = new TXTLogger("log.txt");
        this.loggerJSON = new JSONLogger("log.json");
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;

    }

    public AbstractLogger getLogger() {
        if (this.getTipo().equalsIgnoreCase("txt")) {
            return this.loggerTXT;
        }
        if (this.getTipo().equalsIgnoreCase("json")) {
            return this.loggerJSON;
        }
        return null;
    }

    public String getTipo() {
        return tipo;
    }

}
