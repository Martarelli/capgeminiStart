package ExercicioVinte;
import java.util.Scanner;
/**
 *
 * @author Martarelli
 */
public class Main {

    public static void main(String[] args) {
        int anoFabricacao = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        char desejaRepetir = 's';
        
        Scanner leitor = new Scanner(System.in);
        
        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            
            System.out.println("Digite o ano de fabricação do veiculo: ");
            anoFabricacao = leitor.nextInt();
            
            System.out.println("Digite o valor do veículo: ");
            valorVeiculo = leitor.nextFloat();
            
            if(anoFabricacao <= 2000){
                //12%
                porcentagemDesconto = 0.12f;
            } else {
                //7%
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }

            totalCarros++;

            float valorDesconto = valorVeiculo * porcentagemDesconto;
            
            System.out.println("O valor do desconto foi de: " + valorDesconto);
            System.out.println("O valor que deve ser pago é: " + (valorVeiculo - valorDesconto));
            
            System.out.println("Deseja fazer mais cadastros? S - Sim / N - Não");
            desejaRepetir = leitor.next().charAt(0);         
        }
        
        System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);

    }
    
}
