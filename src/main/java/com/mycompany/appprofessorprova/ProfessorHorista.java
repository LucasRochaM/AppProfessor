
package com.mycompany.appprofessorprova;


public class ProfessorHorista extends Professor{
   private double valorHoraH;
   private double horaTrabMesH;

    public ProfessorHorista(double valorHoraH, double horaTrabMesH, String nome, String matricula, int idade) {
        super(nome, matricula, idade);
        this.valorHoraH = valorHoraH;
        this.horaTrabMesH = horaTrabMesH;
    }

    public double getValorHoraH() {
        return valorHoraH;
    }

    public void setValorHoraH(double valorHoraH) {
        this.valorHoraH = valorHoraH;
    }

    public double getHoraTrabMesH() {
        return horaTrabMesH;
    }

    public void setHoraTrabMesH(double horaTrabMesH) {
        this.horaTrabMesH = horaTrabMesH;
    }

    
   
    @Override
    public double salario() {
       return horaTrabMesH*valorHoraH;
    }

   @Override
    public String dados(){
        return super.dados() + "\nSalário: R$"+salario()+"\n Valor Hora: "+valorHoraH+ 
                "\n Horas Trabalhadas no mês: " +horaTrabMesH;
    }

   
    
    
}
