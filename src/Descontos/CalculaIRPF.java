
package Descontos;

public class CalculaIRPF {
    
    public static double CalculaIRPF(double salario){
        
        double total;

        double aliquota1 = 0.075;
        double aliquota2 = 0.15;
        double aliquota3 = 0.225;
        double aliquota4 = 0.275;

        double valorDeduzido1 = 142.80;
        double valorDeduzido2 = 354.80;
        double valorDeduzido3 = 636.13;
        double valorDeduzido4 = 869.36;

        if (salario <= 1903.98) {
            total = 0;
        } else if (salario <= 2826.65) {
            total = (salario * aliquota1) - valorDeduzido1;
        } else if (salario <= 3751.06) {
            total = (salario * aliquota2) - valorDeduzido2;
        } else if (salario <= 4664.68) {
            total = (salario * aliquota3) - valorDeduzido3;
        } else {
            total = (salario * aliquota4) - valorDeduzido4;
        }
        
        return total;
    }
    
}
