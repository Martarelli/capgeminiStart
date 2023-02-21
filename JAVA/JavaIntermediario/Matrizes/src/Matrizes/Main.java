package Matrizes;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] alunos = {"JOAO", "MARIA", "JOSÉ"};
		
		float [][] notas = new float[3][4];
		
		float somaNotas, mediaAluno;
		String statusAluno;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Aluno: " + alunos[i]);
			somaNotas = 0;
			mediaAluno = 0;
			for (int j = 0; j < 4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota:" + (j+1)));
				somaNotas += notas[i][j];
			}
			
			mediaAluno = somaNotas / 4;
			if (mediaAluno < 5.5) {
				statusAluno = "REPROVADO";
			} else if (mediaAluno >= 5.5 && mediaAluno <= 7.5){
				statusAluno = "RECUPERAÇÃO";
			} else {
				statusAluno = "APROVADO";
			}
			
			System.out.println("\n***********BOLETIM***********");
			System.out.println("Aluno: " + alunos[i]);
			System.out.println("Notas: ");
			for (int j = 0; j < 4; j++) {
				System.out.println("Nota: " + (j+1) + " - " + notas[i][j]);
			}
			System.out.println("Média: " + mediaAluno + " - " + statusAluno);
		}
	}

}
