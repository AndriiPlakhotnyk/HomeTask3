package ua.com.alevel.HT3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exercise2 {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private int[] arrayFibo;

    private int[] inputFiboArray() throws IOException {
        System.out.println("Введите количество чисел фибоначи: ");
        int n = Integer.parseInt(reader.readLine());
        int[] arrayFibo = new int[n];

        arrayFibo[0] = 0;
        arrayFibo[1] = 1;

        for (int i = 2; i < n; i++) {
            arrayFibo[i] = arrayFibo[i - 1] + arrayFibo[i - 2];
        }
        return arrayFibo;
    }

    private int phi(int num) {
        int next = 0;
        for (int i = 0; i < arrayFibo.length-1; i++) {
            if (arrayFibo[i] == num) {
                next = arrayFibo[i + 1];
            }
        }
        return next;
    }

    public void run() throws IOException {
        arrayFibo = inputFiboArray();
        System.out.println(Arrays.toString(arrayFibo));
        System.out.println("Введите число фибоначи: ");
        int fiboN = Integer.parseInt(reader.readLine());
        System.out.println("Следующее число Фиббоначи " + phi(fiboN));
    }
}
