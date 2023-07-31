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

        System.out.print("Insira quantas pessoas gostaria de cadastrar no sistema: ");
        int quantPessoas = scanner.nextInt();

        for (int i = 0; i < quantPessoas; i++){
            List<Endereco> enderecos = new ArrayList<>();
            System.out.print("Insira o nome da pessoa " + (i+1) + ": ");
            String nome = scanner.next();
            System.out.print("Insira a idade da pessoa " + (i+1) + ": ");
            int idade = scanner.nextInt();
            System.out.print("Insira quantos endereços a pessoa " + (i+1) + " terá: ");
            int qntdEnd = scanner.nextInt();
            for (int j = 0; j < qntdEnd; j++) {
                System.out.println("--- Endereço número " + (j + 1));
                System.out.print("  Insira o nome da rua: ");
                String nomeRua = scanner.next();
                System.out.print("  Insira o número da residência: ");
                int numero = scanner.nextInt();
                enderecos.add(new Endereco(nomeRua, numero));
            }
            System.out.println("\nCadastro realizado com sucesso\n");
            pessoas.add(new Pessoa(nome, idade, enderecos));
        }

        return pessoas;
    }

    public void buscar(List<Pessoa> pessoas){
        if (pessoas.isEmpty()){
            System.out.println("\nAinda não existem registros para serem pesquisados\n2");
        }else {
            System.out.print("\nInsira o nome da pessoa que deseja buscar: ");
            String nomeBusca = scanner.next();

            for (int i = 0; i < pessoas.size(); i++){
                if (nomeBusca.equals(pessoas.get(i).getNome())){
                    System.out.println("Nome: " + pessoas.get(i).getNome());
                    System.out.println("Idade: " + pessoas.get(i).getIdade());

                    List<Endereco> enderecos = pessoas.get(i).getEnderecos();

                    System.out.println("Endereços:");
                    for (Endereco endereco : enderecos) {
                        System.out.print("    Rua " + endereco.getNomeRua() + ", Número " + endereco.getNumero() + "\n");
                    }
                    System.out.println("\n");
                }else {
                    System.out.println("\nPessoa não encontrada\n");
                }
            }
        }
    }
}
