package br.senai.sp.jandira.model;

public class Gerente extends Funcionario {
    private double gerenciaBonus;

    public Gerente (String nome, double salario, int id, double gerenciaBonus){
        super(nome, salario, id);
        this.gerenciaBonus = gerenciaBonus;
    }

    @Override
    public double calcularSalario(){
        return getSalario()+gerenciaBonus;
    }
    public double getGerenciaBonus(){
        return gerenciaBonus;
    }
}
