
package Descontos;

public class CalculaVT {
        public static double CalculaVT (double salariobruto) {
        
        double valetransporte;
        double desconto = 0.06;
        
        valetransporte = salariobruto * desconto;
        
        return valetransporte; 
        
    }
    
}
