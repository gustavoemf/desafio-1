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
        return scanner.nextInt();
    }
}
