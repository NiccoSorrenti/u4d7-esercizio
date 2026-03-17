package es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero N che rappresenti il numero di elementi da inserire: ");
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.println("Inserisci N parole: ");

        for (int i = 0; i < n; i++) {
            String parola = scanner.nextLine();

            if (!paroleDistinte.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate: ");
        for (String p : paroleDuplicate) {
            System.out.println(p);
        }

        System.out.println("Numero parole distinte: " + paroleDistinte.size());

        System.out.println("Parole distinte: ");
        for (String p : paroleDistinte) {
            System.out.println(p);
        }
    }
}
