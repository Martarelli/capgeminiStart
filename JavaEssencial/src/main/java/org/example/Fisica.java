package org.example;

public class Fisica extends Pessoa {
    private String cpf;

    @Override
    public String toString() {
        return "Fisica{" +
                "cpf='" + cpf + '\'' +
                '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
