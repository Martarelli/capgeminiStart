package Colletions;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Collections {

	public static void main(String[] args) {
	
		ArrayList<String> carros = new ArrayList<>();
		
		//adicionando elementos
		carros.add("KOMBI");
		carros.add("GOL");
		carros.add("UNO");
		carros.add("COROLLA");
		carros.add("S10");
		carros.add("KWID");
		carros.add("FERRARI");
		
		//substituindo elementos
		carros.set(1, "COMPASS");
		
		//exibindo elementos
		System.out.println("*******CARROS*******");
		for (String carro : carros) {
			System.out.println(carro);
		}
		
		//remover elemento com base no conteudo
		carros.remove("KWID");
		
		//substituindo sem saber posição
		if (carros.contains("COROLLA")) {
			for (int i = 0; i < carros.size(); i++) {
				if("COROLLA".equals(carros.get(i))) {
					carros.set(i, "VECTRA");
					break;
				}
			}
		}
		//exibindo elementos
		System.out.println("*******CARROS*******");
		for (String carro : carros) {
			System.out.println(carro);
		}
		
		//limpa o array
		carros.clear();
		
		//adiciona elemento com joptionpane
		carros.add(JOptionPane.showInputDialog("Insira um carro: ").toUpperCase());
		
		//exibindo elementos
		System.out.println("*******CARROS*******");
		for (String carro : carros) {
			System.out.println(carro);
		}
	}

}
