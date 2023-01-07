package org.example;

import javax.swing.JOptionPane;

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

        //COMANDO SWITCH
        char op = '2';
        switch (op){
            case '1': {
                System.out.println("CASO 1");
                break;
            }
            case '2': {
                System.out.println("CASO 2");
                break;
            }
            case '3': {
                System.out.println("CASO 3");
                break;
            }
            default:
                System.out.println("OPÇÃO INVALIDA: " + op);
        }

        System.out.println("\n------------------------------------------------------------\n");

        //LAÇO REPETIÇÃO

        //WHILE
        num1 = 1;
        while (num1 <= 10){
            System.out.println("Laço número " + num1);
            num1++;
        }

        //DO WHILE
        num1 = 1;
        do {
            System.out.println("Laço número " + num1);
            num1++;
        } while (num1 <= 10);

        //FOR
        for (int i = 0; i < num1; i++) {
            System.out.println("for número " + i);
        }

        for (int i = 0; i < num1; i++) {
            System.out.println("for número " + i);
            if (i == 5){
                System.out.println("parei na iteracao " + i);
                break;
            }
        }

        System.out.println("\n------------------------------------------------------------\n");

        //ENTRADA DADOS VIA JOptionPane
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
        JOptionPane.showMessageDialog(null, "Idade digitada: " + idade);
        JOptionPane.showMessageDialog(null, "Idade digitada: " + idade, "ATENCAO", 0);

        //POO
        Pessoa pes = new Pessoa();
        pes.setNomePessoa("Renan");
        pes.setSituacao("a");
        System.out.println(pes.toString());

        //Herança
        Fisica pesFisica = new Fisica();
        pesFisica.setCpf("1111111111");
        pesFisica.setNomePessoa("OI");
        pesFisica.setSituacao("I");
        System.out.println(pesFisica.toString());

        //POLIMORFISMO
        Mamifero mam1 = new Elefante();
        System.out.println("Cota diaria de leite de um elefante: " + mam1.cotaLeite());

        Mamifero mam2 = new Rato();
        System.out.println("Cota diaria de leite de um rato: " + mam2.cotaLeite());

    }
}