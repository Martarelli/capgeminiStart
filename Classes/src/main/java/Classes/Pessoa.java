package Classes;

public class Pessoa {
    
    //Atributos
    float peso;
    float altura;
    
    //Metodos
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
}
