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
            
            System.out.println("Digite o pre�o de custo do produto: ");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Digite o pre�o de venda do produto: ");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            
            System.out.println(nomeProduto + " Pre�o de venda: " + precoVenda 
                    + " Pre�o de custo: " + precoCusto);
            
            if(precoCusto == precoVenda){
                System.out.println("Houve um empate entre o pre�o de custo e "
                        + " de pre�o de venda para o produto" + nomeProduto);
            } else {
                if(precoCusto > precoVenda){
                   System.out.println("O produto " + nomeProduto + " deu Preju�zo"); 
                }else{
                   System.out.println("O produto " + nomeProduto + " deu Lucro");
                }
            }  
        }
        
        System.out.println("A m�dia do pre�o de custo � de: " + (totalCusto/i));
        System.out.println("A m�dia do pre�o de venda � de: " + (totalVenda/i));   
    }
    
}
