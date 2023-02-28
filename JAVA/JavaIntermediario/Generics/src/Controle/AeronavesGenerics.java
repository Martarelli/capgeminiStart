package Controle;

import java.util.ArrayList;
import java.util.List;

public class AeronavesGenerics<T> {
	
	private List<T> listaAeronaves = new ArrayList<>();
	
	public void addVoo(T nrVoo) {
		listaAeronaves.add(nrVoo);
	}
	
	public T primeiroVoo() {
		if(listaAeronaves.isEmpty()) {
			throw new IllegalStateException("List is empty");
		} else {
			return listaAeronaves.get(0);
		}
	}
	
	public void listaVoos() {
		for (T voo : listaAeronaves) {
			System.out.println(voo);
		}
	}
}
