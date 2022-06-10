
package Holerite;

import Funcionarios.Funcionario;
import java.util.Locale;


public class ImprimeHolerite {
    public static void ImprimeHolerite(Holerite hol, Funcionario func){
        Locale LocaleBR  = new Locale("pt", "BR");
        Locale.setDefault(LocaleBR);
        
        
        for (int i = 0; i < 80; i++){ System.out.print("-"); }
        System.out.println("");
        System.out.println("|\t\t\t - DEMONSTRATIVO DE PAGAMENTO - \t\t\t|");
        for (int i = 0; i < 80; i++){ System.out.print("-"); }
        System.out.println("");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t|");   
        System.out.println("|NOME: " + func.getNome());
        System.out.println("|\t\t\t\t\t\t\t\t\t\t|");
        for (int i = 0; i < 80; i++){ System.out.print("-"); }
        System.out.println("");
        System.out.println("|CRÉDITOS:  \t\t\t\t\t\t\t\t\t|");
        System.out.printf("|Salário: R$ %.2f%n", hol.getSalario());
        System.out.printf("|Hora extra: %.2f%n", hol.getHoraExtra());
        System.out.printf("|Bonus: %.2f%n", hol.getBonus());
        System.out.println("|\t\t\t\t\t\t\t\t\t\t|");
        for (int i = 0; i < 80; i++){ System.out.print("-"); }
        System.out.println("");
        System.out.println("|DESCONTOS:  \t\t\t\t\t\t\t\t\t|");
        System.out.printf("|Desconto INSS: R$ %.2f%n", hol.getInss());
        System.out.printf("|Desconto IRPF: R$ %.2f%n", hol.getIrpf());
        System.out.printf("|Desconto Vale Refeição: R$ %.2f%n", hol.getVr());
        System.out.printf("|Desconto Vale Alimentação: R$ %.2f%n", hol.getVa());
        System.out.printf("|Desconto Vale Transporte: R$ %.2f%n", hol.getVt());
        System.out.printf("|Desconto Convenio Médico: R$ %.2f%n", hol.getConvenioMedico());
        for (int i = 0; i < 80; i++){ System.out.print("-"); }
        System.out.println("");
        double salarioLiq = (hol.getSalario() + hol.getBonus() + hol.getHoraExtra() - (hol.getInss() + hol.getIrpf() + hol.getVr() + hol.getVa() + hol.getVt() + hol.getConvenioMedico()));
        System.out.printf("|Salário Liquido: R$ %.2f%n", salarioLiq);
        for (int i = 0; i < 80; i++){ System.out.print("-"); }
        System.out.println("");
    }
    
}    