
package com.mycompany.appprofessorprova;


public class ProfessorDE extends Professor{
    
private double valorHoraDE;
private double horasTrabSemDE;

    public ProfessorDE(double valorHoraDE, String nome, String matricula, int idade) {
        super(nome, matricula, idade);
        this.valorHoraDE = valorHoraDE;
        this.horasTrabSemDE = 40;
    }

    public double getValorHoraDE() {
        return valorHoraDE;
    }

    public void setValorHoraDE(double valorHoraDE) {
        this.valorHoraDE = valorHoraDE;
    }

    public double getHorasTrabSemDE() {
        return horasTrabSemDE;
    }

    public void setHorasTrabSemDE(double horasTrabSemDE) {
        this.horasTrabSemDE = horasTrabSemDE;
    }


@Override
    public String dados(){
        return super.dados() + "\nSalário: R$" +salario() + "\nHoras trabalhadas no mês: "+(horasTrabSemDE*5);
    }

    @Override
    public double salario() {
        return 5*valorHoraDE*horasTrabSemDE;
    }
    
    
    
}
