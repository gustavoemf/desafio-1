package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Functions functions = new Functions();
        List<Pessoa> pessoas = new ArrayList<>();
        int option;

        do{
            option = functions.menu();

            switch (option){
                case 1 -> pessoas = functions.cadastrar();
                case 3 -> {
                    System.out.print("\nSaindo...\n");
                    System.exit(0);
                }
                default -> System.out.println("\nOpção inválida, tente novamente\n");
            }
        }while(option != 3);

    }
}