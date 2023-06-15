package dz_3;

//Пусть дан произвольный список целых чисел.
//1) Нужно удалить из него чётные числа

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class dz_3 {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите длину списка: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> spisok = new ArrayList<Integer>();
            Random rand = new Random();
            for (int i = 0; i < N; i++) {
                int x = rand.nextInt(N);
                spisok.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + spisok);

            for (int i = spisok.size() - 1; i > 0; i--) {
                int even = spisok.get(i) % 2;
                if (even == 0) {
                    spisok.remove(i);
                }
            }
            Collections.sort(spisok);
            System.out.println("Список с удаленными четными числами: \n " + spisok);
        }
    }

}