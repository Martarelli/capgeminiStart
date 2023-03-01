package Annotations;

public class AnnotationInformacao {

	void visualizar() {
		System.out.println("Método Visualização");
	}
	
	@Deprecated
	void exibir() {
		System.out.println("Método que o metodo exibir é @deprecated");
	}
	
}
