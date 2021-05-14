
package com.mycompany.appprofessorprova;


public  abstract class Professor {
    private String nome,matricula;
    private int idade;

    public Professor(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public abstract double salario();
    
    
    
    public String dados(){
       return "Nome: " +nome+
               "\n Matrícula: "+matricula+
               "\n Idade: "+idade;
    };
}
