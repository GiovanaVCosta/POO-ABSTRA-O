package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Programador;
import br.senai.sp.jandira.model.Gerente;

public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Giovana Vieira", 7, 1500, 15000);
        Programador programador = new Programador("Julia Paiva", 12, 67, 18);

        System.out.println("[                  Informações do Gerente:             ]");
        System.out.println("[        Nome:"+ gerente.getNome()+"                           ]");
        System.out.println("[        Salário Base: R$ " + gerente.getSalario()+"                          ]");
        System.out.println("[        Id:" + gerente.getId()+"                                       ]");
        System.out.println("[        Bônus de Gerência" + gerente.getGerenciaBonus()+"                      ]");
        System.out.println("[---------------Salário Total: R$" + gerente.calcularSalario()+"---------------]");
        System.out.println();
        System.out.println();
        System.out.println("[              Informações do Programador:             ]");
        System.out.println("[        Nome: " + programador.getNome()+"                             ]");
        System.out.println("[        Id: " + programador.getId()+"                                      ]");
        System.out.println("[        Salário Base: R$" + programador.getSalario()+"                          ]");
        System.out.println("[        Horas Extras: " + programador.getHoras()+"                              ]");
        System.out.println("[---------------Salário Total: R$" + programador.calcularSalario()+"-----------------]");
    }
}
