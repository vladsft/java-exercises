package random_numbers.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int range = Integer.parseInt(args[0]), count = 0;
        boolean[] frequencyList = new boolean[range];
        boolean allTrue = false;
        Random generator = new Random();
        System.out.println("Generating random numbers:");
        while (!allTrue) {
            int next_no = generator.nextInt(range);
            frequencyList[next_no] = true;
            System.out.print(next_no + " ");
            allTrue = true;
            for (boolean frequency : frequencyList) {
                if (!frequency) {
                    allTrue = false;
                }
            }
            count++;
        }
        System.out.print("\n" + count + " numbers generated between 0 and " + range);
    }
}