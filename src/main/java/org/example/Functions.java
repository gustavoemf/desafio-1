package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Functions {
    Scanner scanner = new Scanner(System.in);

    public int menu(){
        System.out.println("Sistema de cadastro de pessoas");
        System.out.println("1 - Cadastrar nova pessoa");
        System.out.println("2 - Procurar pessoa");
        System.out.println("3 - Sair");
        System.out.print("Selecione a opção desejada: ");
        return scanner.nextInt();
    }

    public List<Pessoa> cadastrar(){
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Insira quantas pessoas gostaria de cadastrar no sistema: ");

        int quantPessoas = scanner.nextInt();

        for(int i = 0; i < quantPessoas; i++){
            List<Endereco> enderecos = new ArrayList<>();
            System.out.print("Insira o nome da pessoa " + (i+1) + ": ");
            String nome = scanner.next();
            System.out.print("Insira a idade da pessoa " + (i+1) + ": ");
            int idade = scanner.nextInt();
            System.out.print("Insira quantos endereços a pessoa " + (i+1) + " terá: ");
            int qntdEnd = scanner.nextInt();
            for (int j = 0; j < qntdEnd; j++) {
                System.out.println("--- Endereço número" + (j + 1));
                System.out.print("Insira o nome da rua: ");
                String nomeRua = scanner.next();
                System.out.print("Insira o número da residência: ");
                int numero = scanner.nextInt();
                enderecos.add(new Endereco(nomeRua, numero));
            }
            pessoas.add(new Pessoa(nome, idade, enderecos));
        }

        return pessoas;
    }
}
