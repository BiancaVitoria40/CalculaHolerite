
package Descontos;


public class CalculaINSS {
    public static double CalculaINSS(double salario){
        double total;

        double aliquota1 = (double) 0.075;
        double aliquota2 = (double) 0.09;
        double aliquota3 = (double) 0.12;
        double aliquota4 = (double) 0.14;

        if (salario <= 1212.00) {
            total = aliquota1 * salario;
        } else if (salario <= 2427.35) {
            total = aliquota2 * salario;
        } else if (salario <= 3641.03) {
            total = aliquota3 * salario;
        } else {
            total = aliquota4 * salario;
        }
        
        return total;
    }
}
