package ua.com.alevel.HT3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {

    public int[] inputArray() {
        int [] array = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите колличество элементов массива");
            int N = Integer.parseInt(reader.readLine());
            array = new int[N];
            System.out.println("Заполните массив целыми числами");
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }
        } catch (IOException e) {
        }
        return array;
    }

    public int election(int[] array) {
        int maxMeet = 0;
        int count = 0;
        int maxCount = 0;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != array[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxMeet = array[i];
            }
        }

        return maxMeet;
    }
}
