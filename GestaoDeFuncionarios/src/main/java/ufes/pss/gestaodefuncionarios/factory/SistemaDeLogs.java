package ufes.pss.gestaodefuncionarios.factory;

import ufes.pss.gestaodefuncionarios.Logger.AbstractLogger;
import ufes.pss.gestaodefuncionarios.Logger.JSONLogger;
import ufes.pss.gestaodefuncionarios.Logger.TXTLogger;

public class SistemaDeLogs {

    private AbstractLogger logger;
    private String tipo;

    public SistemaDeLogs(String tipo) {
        setTipo(tipo);
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
        if (tipo.toLowerCase().equals("txt")) {
            this.logger = new TXTLogger("Logs/log.txt");
        } else if (tipo.toLowerCase().equals("json")) {
            this.logger = new JSONLogger("Logs/log.json");
        }
    }

    public AbstractLogger getLogger() {
        return logger;
    }

    public void setLogger(AbstractLogger logger) {
        this.logger = logger;
    }

    public String getTipo() {
        return tipo;
    }

}
