package ufes.pss.gestaodefuncionarios.utils;

import ufes.pss.gestaodefuncionarios.model.Bonus;
import ufes.pss.gestaodefuncionarios.model.Funcionario;

public class CalculaSalario {
    
    public static void CalcularSalario(Funcionario funcionario) {
        double salarioCalculado = funcionario.getSalario();
        
        for (Bonus b : funcionario.getBonusRecebidos()) {
            salarioCalculado += funcionario.getSalario() * b.getValor();
        }
        
        funcionario.setSalarioComBonus(salarioCalculado);
        
    }
    
}
