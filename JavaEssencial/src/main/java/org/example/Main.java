package org.example;

public class Main {
    public static void main(String[] args) {

        int numero;
        String cadeiaCaracteres;
        char caracter;
        boolean certoOuErrado;

        numero = 10;
        cadeiaCaracteres = "Curso java fundamentos";
        caracter = 'S';
        certoOuErrado = true;

        System.out.println("O valor de número é: " + numero);
        System.out.println("O valor de cadeia caracteres é: " + cadeiaCaracteres);
        System.out.println("O valor de caracter é: " + caracter);
        System.out.println("O valor de certo ou errado é: " + certoOuErrado);

        System.out.println("\n------------------------------------------------------------\n");

        int num1, num2, num3;

        //SOMA
        num1 = 10;
        num2 = 20;
        num3 = num1 + num2;
        System.out.println(num3);

        //SUBTRAÇÃO
        num1 = 10;
        num2 = 20;
        num3 = num1 - num2;
        System.out.println(num3);

        //DIVISÃO
        num1 = 40;
        num2 = 20;
        num3 = num1 / num2;
        System.out.println(num3);

        //MULTIPLICAÇÃO
        num1 = 10;
        num2 = 20;
        num3 = num1 * num2;
        System.out.println(num3);

        System.out.println("\n------------------------------------------------------------\n");

        //INCREMENTANDO DE 1 EM 1
        num1 = 0;
        while (num1 < 10){
            num1++;
            System.out.println(num1);
        }

        //DECREMENTANDO DE 1 EM 1
        while (num1 > 0){
            System.out.println(num1);
            num1--;
        }

        System.out.println("\n------------------------------------------------------------\n");

        //OPERADORES RELACIONAIS
        num1 = 10;
        num2 = 10;

        //IGUALDADE
        if (num1 == num2){
            System.out.println("Numero 1 e número 2 são iguais");
        }

        //DIFERENTES
        num2 = 11;
        if (num1 != num2){
            System.out.println("Numero 1 e número 2 são diferentes");
        }

        //MAIOR
        if (num1 > num2){
            System.out.println("Numero 1 é maior que número 2");
        } else {
            System.out.println("Numero 2 é maior que número 1");
        }

        System.out.println("\n------------------------------------------------------------\n");

        //OPERADORES LÓGICOS
        num1 = 10;
        num2 = 5;
        num3 = 20;
        int num4 = 5;


        if ((num1 > num3) && (num2 == num4)){
            System.out.println("Primeira condição satisfeita");
        } else {
            System.out.println("Segunda condição satisfeita");
        }

        if ((num1 > num3) || (num2 == num4)){
            System.out.println("Primeira condição satisfeita");
        } else {
            System.out.println("Segunda condição satisfeita");
        }

        System.out.println("\n------------------------------------------------------------\n");

        //CONDIÇÕES COMPOSTA
        num1 = 10;
        num2 = 12;
        if (num1 > num2){
            System.out.println("N1 > N2");
        } else if (num1 < num2) {
            System.out.println("N1 < N2");
        } else {
            System.out.println("N1 = N2");
        }
    }
}