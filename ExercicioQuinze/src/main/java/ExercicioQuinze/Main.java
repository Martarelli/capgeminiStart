package ExercicioQuinze;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int numero;
        System.out.println("Digite um n�mero: ");
        Scanner leitorScanner = new Scanner(System.in);
        
        numero = leitorScanner.nextInt();
        
        if(numero >= 100 && numero <= 200){
            System.out.println("O n�mero est� no intervalo");
        } else {
            System.out.println("O n�mero n�o est� no intervalo");
        }
        
    }
    
}
