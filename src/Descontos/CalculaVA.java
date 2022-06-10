
package Descontos;


public class CalculaVA {
    public static double CalculaVA(double salario){
        double total;
        if(salario <= 1212 * 3){
            total = 0;
        } else {
            total = salario * 0.02;
        }
        
        return total;
    }
    
}
