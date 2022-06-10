
package Interface;

import static Ganhos.CalculaBonus.CalculaBonus;
import static Ganhos.CalculaSalario.CalculaSalario;
import static Ganhos.CalculaHoraExtra.CalculaHoraExtra;
import Funcionarios.*;
import static Holerite.ImprimeHolerite.ImprimeHolerite;
import static Holerite.MontaHolerite.MontaHolerite;
import java.util.*;

public class Menu {
    public static void Menu(){
        Locale LocaleBR  = new Locale("pt", "BR");
        Locale.setDefault(LocaleBR);
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();

        
        String sair = "não";        
            System.out.println("Bem vindo ao sistema de geração de holerite");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t");
            System.out.println("");       
        do {
            System.out.println("-------------------- MENU -------------------- ");    
            System.out.println("1 - Cadastro de funcionario.");
            System.out.println("2 - Gerar holerite.");
            System.out.println("3 - Sair.");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t");
            System.out.println("Digite uma das opções: ");
            int opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    func = CadastroFunc.CadastroFunc(func);
                    break;
                case 2:
                    
                    if (func.getNome() == null){
                        System.out.println("----------------------------------------");

                        System.out.println("| Nenhum funcionário cadastrado. |");

                        System.out.println("----------------------------------------\n");
                    }else{
                    ImprimeHolerite(MontaHolerite(func), func);
                    
                    System.out.println("----------------------------------");
                    System.out.println("Dejesa sair? (S/N)");
                    String s = sc.next();
                    System.out.println("");
                    if (s.equalsIgnoreCase("S")){
                        sair = "sim";
                    }
                    }
                    break;
                case 3:
                    sair = "sim";
                    System.out.println("Obrigado por usar!");
                    break;
                default:
                    System.out.println("----------------------------------------");

                    System.out.println("|\t Digite uma opção válida!\t|");

                    System.out.println("----------------------------------------\n");                    
                    break;
            }
                
        } while (sair.equals("não"));
        
    }
}
