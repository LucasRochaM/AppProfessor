package com.mycompany.appprofessorprova;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        String tipoProfessor[] = {"Dedicação exclusiva", "Horista", "Bolsista", "Visitante"};
        String opcao[] = {"Cadastrar Professor", "Sair"};

        while (true) {
            String operacao = (String) JOptionPane.showInputDialog(null, "Selecione o que deseja fazer", "App Professor",
                    3, null, opcao, opcao[0]);
            if (operacao.equals(opcao[1])) {
                break;
            }

            String opUsr = (String) JOptionPane.showInputDialog(null, "Selecione a categoria do professor", "App Professor",
                    3, null, tipoProfessor, tipoProfessor[0]);
            String nome = JOptionPane.showInputDialog(null, "Informe o nome do professor", "App Professor", JOptionPane.QUESTION_MESSAGE);
            String matricula = JOptionPane.showInputDialog(null, "Informe a matrícula do professor", "App Professor", JOptionPane.QUESTION_MESSAGE);
            Integer idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do professor ", "App Professor", JOptionPane.QUESTION_MESSAGE));
            Professor professor = null;

            switch (opUsr) {
                case "Dedicação exclusiva":
                    double valorHoraDE = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da hora trabalhada",
                            "App Professor", 3));
                    professor = new ProfessorDE(valorHoraDE, nome, matricula, idade);
                    break;

                case "Horista":
                    double valorHoraH = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da hora",
                            "App Professor", 3));
                    double horaTrabMesH = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe as horas trabalhadas no mês",
                            "App Professor", 3));
                    professor = new ProfessorHorista(valorHoraH, horaTrabMesH, nome, matricula, idade);

                    break;
                case "Bolsista":
                    double bolsaDeEstudo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da bolsa",
                            "App Professor", 3));
                    professor = new ProfessorBolsista(bolsaDeEstudo, nome, matricula, idade);
                    break;
                case "Visitante":
                    String nomeInstituicao = JOptionPane.showInputDialog(null, "Informe o nome da instituição", "App Professor", JOptionPane.QUESTION_MESSAGE);
                    String paisOrigem = JOptionPane.showInputDialog(null, "Informe o país de origem", "App Professor", JOptionPane.QUESTION_MESSAGE);
                    professor = new ProfessorVisitante(nomeInstituicao, paisOrigem, nome, matricula, idade);
                    break;

            }
            if (professor != null) {
                JOptionPane.showMessageDialog(null, professor.dados(), "Professor cadastrado com sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        System.exit(0);
    }
}
