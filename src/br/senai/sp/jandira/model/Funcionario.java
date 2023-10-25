package br.senai.sp.jandira.model;

abstract class Funcionario {
    String nome;
    double salario;
    int id;


    public Funcionario( String nome, double salario, int id){
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }
    public abstract double calcularSalario();

    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    public int getId(){
        return id;
    }
}
