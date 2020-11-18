package approcheimperative.idea;

import approcheimperative.compiler.Hello;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hello.main(args);
        System.out.println("Bienvenu dans mon application!");
        String name;
        System.out.println("Entrez votre nom");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        sc.close();
        System.out.println("Bienvenue '"+name+"'");
        System.out.println();
    }
}
