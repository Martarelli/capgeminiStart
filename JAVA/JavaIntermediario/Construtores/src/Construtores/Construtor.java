package Construtores;

import Construtores.Aluno.MATRICULA;
import Construtores.Aluno.STATUS;

public class Construtor {

	public static void main(String[] args) {

		Aluno alu = new Aluno(8,2,3);
		
		double mediaAlunoFinal = alu.calcularMedia();
		
		if (mediaAlunoFinal < 6) {
			alu.situacaoAluno = STATUS.REPROVADO;
		} else {
			alu.situacaoAluno = STATUS.APROVADO;
		}
		
		System.out.printf("A média do aluno é: %.2f e o aluno está %s\n", mediaAlunoFinal,alu.situacaoAluno);

		alu.situacaoMatricula = MATRICULA.MATRICULADO;
		System.out.println("Situação do aluno: " + alu.situacaoMatricula);
	}

}
