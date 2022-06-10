
package Ganhos;

public class CalculaHoraExtra {
    public static double CalculaHoraExtra(double qtdHorasTrabalhadas, double valorHora, double porcentagem){
        if (porcentagem == 50){
            return (qtdHorasTrabalhadas * (valorHora * 1.5) );
        } else if (porcentagem == 100){
            return (qtdHorasTrabalhadas * (valorHora * 2) );
        } 
        return 0;   
    }
}
