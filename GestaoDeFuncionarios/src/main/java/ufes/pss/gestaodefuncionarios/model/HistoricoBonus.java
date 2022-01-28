package ufes.pss.gestaodefuncionarios.model;

import java.util.ArrayList;

public class HistoricoBonus {

    private ArrayList<Bonus> historico;

    public HistoricoBonus() {
        historico = new ArrayList<>();
    }

    public void addBonusHistorico(Bonus bonus) {
        historico.add(bonus);
    }

    public ArrayList<Bonus> getHistorico() {
        return historico;
    }

}
