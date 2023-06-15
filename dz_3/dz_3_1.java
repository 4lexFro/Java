package dz_3;
/*Пусть дан произвольный список целых чисел.
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class dz_3_1 {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> spisok = new ArrayList<Integer>();
            Random rand = new Random();
            for (int i = 0; i < N; i++) {
                int x = rand.nextInt(1000);
                spisok.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + spisok);

            int min = spisok.get(0);
            int max = spisok.get(0);
            float summa = 0;
            for (int i = 0; i < spisok.size(); i++) {
                int num = spisok.get(i);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                summa += num;
            }
            float sredarifm = summa / spisok.size();
            String result = String.format("%8.2f", sredarifm).replace(',', '.');

            System.out.println("Минимальное значение: " + min);

            System.out.println("Максимальное значение: " + max);

            System.out.println("Среднее арифметическое значение: " + result);
        }
    }
}