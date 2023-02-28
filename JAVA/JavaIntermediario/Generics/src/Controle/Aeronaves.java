package Controle;

import java.util.ArrayList;
import java.util.List;

public class Aeronaves {
	private List<Integer> listaAeronaves = new ArrayList<Integer>();
	
	public void addVoo(Integer nrVoo) {
		listaAeronaves.add(nrVoo);
	}
	
	public Integer primeiroVoo() {
		if(listaAeronaves.isEmpty()) {
			throw new IllegalStateException("List is empty");
		} else {
			return listaAeronaves.get(0);
		}
	}
	
	public void listaVoos() {
		for (Integer voo : listaAeronaves) {
			System.out.println(voo);
		}
	}
	
}
