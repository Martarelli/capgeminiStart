package Classes;

public class Pessoa {
    
    //Atributos
    private float peso;
    private float altura;
    
    //Metodo Construtor
    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
    }
    
    //Metodos
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
    
    //Metodos acessores (get e set)
    public void setPeso(float peso){
        this.peso = peso;
    }
    public float getPeso(){
        return peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getAltura(){
        return altura;
    }
}
