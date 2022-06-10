
package Descontos;


public class CalculaConvenioMedico {
        public static double CalculaConvenioMedico (double salariobruto) {
        
        double convenio;
        double descontos = 0.04;
        
        convenio = salariobruto * descontos;
        
        if(salariobruto <= 1212.0) {
            return salariobruto * 0;
        } else {
        return convenio; }
    } 
    
}
