package Arrays;

import javax.swing.JOptionPane;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] paises = new String[4];
//		
//		paises[0] = "Brasil";
//		paises[1] = "Argentina";
//		paises[2] = "EUA";
//		paises[3] = "Japão";
		
		String[] paises = new String[4];
		
		for (int i = 0; i < 4; i++) {
			paises[i] = JOptionPane.showInputDialog("Informe um país: ");
		} 
		
		for (String string : paises) {
			System.out.println(string);
		}
	}

}
