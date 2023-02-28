package Generics;

import java.util.Scanner;

import Controle.Aeronaves;

public class Generics {

	public static void main(String[] args) {
		
		//EXEMPLO SEM GENERICS
		Scanner sc =  new Scanner(System.in);
		
		Aeronaves air = new Aeronaves();
		System.out.println("numero voos:");
		int nrAeronaves = sc.nextInt();
		
		for (int i = 0; i < nrAeronaves; i++) {
			System.out.println("numero aeronave: ");
			int nrVoo = sc.nextInt();
			air.addVoo(nrVoo);
		}
		
		System.out.println("Primeiro voo vai ser o nr: " + air.primeiroVoo());
		air.listaVoos();
		sc.close();
		
		

	}

}
