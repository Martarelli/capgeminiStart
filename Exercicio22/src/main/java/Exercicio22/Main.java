package Exercicio22;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        int i = 0;
        for (; i < 3; i++) {
            
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitor.nextLine();
            
            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Digite o preço de venda do produto: ");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            
            System.out.println(nomeProduto + " Preço de venda: " + precoVenda 
                    + " Preço de custo: " + precoCusto);
            
            if(precoCusto == precoVenda){
                System.out.println("Houve um empate entre o preço de custo e "
                        + " de preço de venda para o produto" + nomeProduto);
            } else {
                if(precoCusto > precoVenda){
                   System.out.println("O produto " + nomeProduto + " deu Prejuízo"); 
                }else{
                   System.out.println("O produto " + nomeProduto + " deu Lucro");
                }
            }  
        }
        
        System.out.println("A média do preço de custo é de: " + (totalCusto/i));
        System.out.println("A média do preço de venda é de: " + (totalVenda/i));   
    }
    
}
