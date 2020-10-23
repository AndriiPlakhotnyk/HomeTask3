package ua.com.alevel.HT3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Exercise1 exercise1 = new Exercise1();
        System.out.println(exercise1.election(exercise1.inputArray()));

        Exercise2 exercise2 = new Exercise2();
        exercise2.run();

        Exercise3 exercise3 = new Exercise3();
        exercise3.getNumber();

    }
}
