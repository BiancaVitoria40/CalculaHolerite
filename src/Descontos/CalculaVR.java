
package Descontos;

public class CalculaVR {
    public static double CalculaVR(double salario){
        double total;
        
        if(salario <= 1212.00){
            total = 0;
        } else{
            total = salario * 0.03;
        }
        
        return total;
    }
}
