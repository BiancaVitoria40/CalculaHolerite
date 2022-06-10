/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class CadastroFunc {
        
    public static Funcionario CadastroFunc(Funcionario func){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInforme o nome do funcionario:");
        func.setNome(sc.next());
        
        System.out.println("\nInforme o valor da Hora:");
        func.setValorHora(sc.nextDouble());
        
        System.out.println("\nInforme a quantidade de horas trabalhadas:");
        func.setHorasTrabalhadas(sc.nextDouble());
        
        System.out.println("\nInforme a quantidade de horas extras");
        func.setHorasExtras(sc.nextDouble());
        
        System.out.println("\nInforme porcentagem de acrescimo hora extra (50 ou 100, 0 se não existir Horas Extras)");
        double xHE = sc.nextDouble();
        while(xHE != 0 && xHE != 50 && xHE != 100){
            System.out.println("Insira um valor valido.");
            xHE = sc.nextDouble();
        }
        func.setAcrescimoHoraExtra(xHE);
        
        
        System.out.println("\nInforme o multiplicador do bonus, caso não exista insira 0");
        func.setMultiplicadorBonus(sc.nextDouble());
        
        return func;
    }
    
}
