package ufes.pss.gestaodefuncionarios.collection;

import java.util.ArrayList;
import ufes.pss.gestaodefuncionarios.model.Bonus;
import ufes.pss.gestaodefuncionarios.model.BonusHistorico;

public class HistoricoBonus {

    private ArrayList<BonusHistorico> historico;

    public HistoricoBonus() {
        historico = new ArrayList<>();
    }

    public void addBonusHistorico(Bonus bonus, String cargo, double salarioBase) {
        historico.add(new BonusHistorico(bonus.getNome(), bonus.getValor(), cargo, salarioBase));
    }

    public ArrayList<BonusHistorico> getHistorico() {
        return historico;
    }

}
