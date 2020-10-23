package ua.com.alevel.HT3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exercise3 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void getNumber() throws IOException {
        System.out.println("Введите число: ");
        int n = Integer.parseInt(reader.readLine());
        int[] nums = new int[n];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;

        }

        for (int num : nums) {
            sum = sum + square(num);
        }

        System.out.println(sum);

    }

    public int square(int n) {
        int pow = n * n;
        return pow;
    }
}
