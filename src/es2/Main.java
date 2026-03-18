package es2;

import java.util.List;
import java.util.Random;

public class Main {
    static void main(String[] args) {
        generaLista(100);

    }

    public static List<Integer> generaLista(int n) {
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            random.nextInt(0, 101);
        }
    }
}
