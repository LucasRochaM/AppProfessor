
package com.mycompany.appprofessorprova;


 
public class ProfessorVisitante extends Professor {
    private String nomeInstituicao,paisOrigem;
//Construtor
    public ProfessorVisitante(String nomeInstituicao, String paisOrigem, String nome, String matricula, int idade) {
        super(nome, matricula, idade);
        this.nomeInstituicao = nomeInstituicao;
        this.paisOrigem = paisOrigem;
    }
    
    //Métodos de acesso

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @Override
    public double salario() {
        return 0.00;
    }
    
    @Override
    public String dados(){
        return super.dados() + "\nNome da instituição: "+nomeInstituicao+
                                "\nPais de Origem: "+paisOrigem;
    }
    
}
