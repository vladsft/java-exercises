package lottery_numbers.src;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int range = 50;
        Set<Integer> uniqueNumbers = new HashSet<>();
        Random generator = new Random();

        while (uniqueNumbers.size() < 7) {
            int number = generator.nextInt(range);
            uniqueNumbers.add(number);
        }

        int i = 1;
        for (int numbers : uniqueNumbers) {
            System.out.println("Number " + i + ": " + numbers);
            i++;
        }
    }
}