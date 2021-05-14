
package com.mycompany.appprofessorprova;


public class ProfessorBolsista extends Professor {
    private double bolsaDeEstudo;

    public ProfessorBolsista(double bolsaDeEstudo, String nome, String matricula, int idade) {
        super(nome, matricula, idade);
        this.bolsaDeEstudo = bolsaDeEstudo;
    }

    public double getBolsaDeEstudo() {
        return bolsaDeEstudo;
    }

    public void setBolsaDeEstudo(double bolsaDeEstudo) {
        this.bolsaDeEstudo = bolsaDeEstudo;
    }

    @Override
    public double salario() {
        return 0.00;
    }
    @Override
    public String dados(){
        return super.dados() + "\nBolsa de estudo: "+bolsaDeEstudo;
    }
}
