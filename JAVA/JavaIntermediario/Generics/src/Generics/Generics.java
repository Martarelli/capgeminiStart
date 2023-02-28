package Generics;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Controle.Aeronaves;
import Controle.AeronavesGenerics;

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
		
		//Exemplo com generics
		AeronavesGenerics<Integer> airGenerics = new AeronavesGenerics<>();
		System.out.println("numero voos:");
		int nrAero = sc.nextInt();
		
		for (int i = 0; i < nrAero; i++) {
			System.out.println("numero aeronave: ");
			Integer nrVoo = sc.nextInt();
			airGenerics.addVoo(nrVoo);
		}
		
		System.out.println("Primeiro voo vai ser o nr: " + airGenerics.primeiroVoo());
		airGenerics.listaVoos();
		
		AeronavesGenerics<String> airGenericsString = new AeronavesGenerics<>();
		System.out.println("numero voos:");
		int nrAeroString = sc.nextInt();
		
		for (int i = 0; i < nrAeroString; i++) {
			System.out.println("numero aeronave: ");
			String nrVoo = JOptionPane.showInputDialog("nr do voo: ");
			airGenericsString.addVoo(nrVoo);
		}
		
		System.out.println("Primeiro voo vai ser o nr: " + airGenericsString.primeiroVoo());
		airGenericsString.listaVoos();
		sc.close();
		

	}

}
