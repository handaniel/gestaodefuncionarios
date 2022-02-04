package ufes.pss.gestaodefuncionarios.Logger;

import java.io.File;

public abstract class AbstractLogger {

    private File file;

    public AbstractLogger(File file) {
        this.file = file;
    }

    public abstract void log();

}
