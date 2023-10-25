package br.senai.sp.jandira.model;

public class Programador  extends Funcionario{
    private int horas;

    public Programador(String nome, double salario, int id, int horas){
        super(nome, salario,id);
        this.horas = horas;
    }
    @Override
    public double calcularSalario() {
        return getSalario() + (horas * 35);
    }

    public int getHoras() {
        return horas;
    }
}
