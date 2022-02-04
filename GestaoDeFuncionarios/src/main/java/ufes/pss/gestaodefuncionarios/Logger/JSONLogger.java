package ufes.pss.gestaodefuncionarios.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import org.json.simple.JSONObject;

public class JSONLogger extends AbstractLogger {

    public JSONLogger(String fileName) {
        super(fileName);
    }

    @Override
    public void logCRUDFuncionario(String nome, String operacao) {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("Horário ", DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(LocalDateTime.now()));
        jsonObject.put("Operação", operacao);
        jsonObject.put("Funcionário", nome);

        try {
            FileWriter writer = new FileWriter(this.getFileName(), true);

            writer.write(jsonObject.toJSONString() + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Erro ao criar log!");
        }

    }

    @Override
    public void logFalha(String operacao, String excesao) {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("Horário ", DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(LocalDateTime.now()));
        jsonObject.put("Falha na operação", operacao);
        jsonObject.put("Exceção", excesao);

        try {
            FileWriter writer = new FileWriter(this.getFileName(), true);

            writer.write(jsonObject.toJSONString() + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Erro ao criar log!");
        }
    }

    @Override
    public void logConsultaBonus(String nome) {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("Horário ", DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(LocalDateTime.now()));
        jsonObject.put("Bônus Visto de", nome);

        try {
            FileWriter writer = new FileWriter(this.getFileName(), true);

            writer.write(jsonObject.toJSONString() + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Erro ao criar log!");
        }
    }

    @Override
    public void logCalculaSalario(ArrayList<String> funcionariosCalculados) {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("Horário ", DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(LocalDateTime.now()));
        String nomes = String.join(", ", funcionariosCalculados);
        jsonObject.put("Salário calculado de ", nomes);

        try {
            FileWriter writer = new FileWriter(this.getFileName(), true);

            writer.write(jsonObject.toJSONString() + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Erro ao criar log!");
        }
    }

    @Override
    public void mudarSistema() {
        try {
            Files.write(Paths.get(this.getFileName()),
                    ("\n ======== Mudança para Persistência de Logs em JSON em " + DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(LocalDateTime.now())
                            + " ========\n").getBytes(),
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao alterar arquivo;");
        }
    }

}
