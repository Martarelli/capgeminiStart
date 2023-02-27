package Wrappers;

public class Wrappers {

	public static void main(String[] args) {

		Boolean bolWrapper = true;
		System.out.println(bolWrapper.getClass());
		
		Character charWrapper = 'a';
		System.out.println(charWrapper.getClass());
		
		Byte byteWrapper = 1;
		System.out.println(byteWrapper.getClass());
		
		Short shortWrapper = 'B';
		System.out.println(shortWrapper.getClass());
		
		Integer intWrapper = 2222;
		System.out.println(intWrapper.getClass());
		
		Long longWrapper = 13214324L;
		System.out.println(longWrapper.getClass());
		
		Float floatWrapper = 3.14159f;
		System.out.println(floatWrapper.getClass());
		
		Double doubleWrapper = 3.14159;
		System.out.println(doubleWrapper.getClass());
		
		int numero = Integer.parseInt("1");
		numero += 1;
		System.out.println(numero);
		
		
	}

}
