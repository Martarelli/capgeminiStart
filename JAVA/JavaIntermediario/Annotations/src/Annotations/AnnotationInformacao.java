package Annotations;

public class AnnotationInformacao {

	void visualizar() {
		System.out.println("M�todo Visualiza��o");
	}
	
	@Deprecated
	void exibir() {
		System.out.println("M�todo que o metodo exibir � @deprecated");
	}
	
}
