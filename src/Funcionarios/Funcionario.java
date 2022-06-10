
package Funcionarios;


public class Funcionario {
    private String nome;
    private double valorHora;
    private double horasTrabalhadas;
    private double horasExtras;
    private double acrescimoHoraExtra;
    private double multiplicadorBonus;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }  
    
    public double getAcrescimoHoraExtra() {
        return acrescimoHoraExtra;
    }

    public void setAcrescimoHoraExtra(double acrescimoHoraExtra) {
        this.acrescimoHoraExtra = acrescimoHoraExtra;
    }

    public double getMultiplicadorBonus() {
        return multiplicadorBonus;
    }

    public void setMultiplicadorBonus(double multiplicadorBonus) {
        this.multiplicadorBonus = multiplicadorBonus;
    }
    
}
