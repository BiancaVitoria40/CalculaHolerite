
package Holerite;

import static Descontos.CalculaConvenioMedico.CalculaConvenioMedico;
import static Descontos.CalculaINSS.CalculaINSS;
import static Descontos.CalculaIRPF.CalculaIRPF;
import static Descontos.CalculaVA.CalculaVA;
import static Descontos.CalculaVR.CalculaVR;
import static Descontos.CalculaVT.CalculaVT;
import Funcionarios.Funcionario;
import static Ganhos.CalculaBonus.CalculaBonus;
import static Ganhos.CalculaSalario.CalculaSalario;
import static Ganhos.CalculaHoraExtra.CalculaHoraExtra;

public class MontaHolerite {
    public static Holerite MontaHolerite(Funcionario func){
        
        Holerite holerite = new Holerite();
        double salario = CalculaSalario(func.getHorasTrabalhadas(),func.getValorHora());
        
        holerite.setSalario(salario);
        holerite.setHoraExtra(CalculaHoraExtra(func.getHorasExtras(), func.getValorHora(), func.getAcrescimoHoraExtra()));
        holerite.setBonus(CalculaBonus(salario, func.getMultiplicadorBonus()));
        holerite.setInss(CalculaINSS(salario));
        holerite.setConvenioMedico(CalculaConvenioMedico(salario));
        holerite.setIrpf(CalculaIRPF(salario));
        holerite.setVa(CalculaVA(salario));
        holerite.setVr(CalculaVR(salario));
        holerite.setVt(CalculaVT(salario));
       
        return holerite;
    }
}
