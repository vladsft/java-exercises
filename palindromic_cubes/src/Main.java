package palindromic_cubes.src;

import java.math.BigInteger;

public class Main {
    private static boolean isPalindrome(String n) {
        int length = n.length();
        if (length <= 1) {
            return true;
        } else {
            return isPalindrome(n.substring(1, length - 1)) && n.charAt(0) == n.charAt(length - 1);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 3000; i++) {
            BigInteger cube = BigInteger.valueOf((long) i * i * i);
            if (isPalindrome(cube.toString())) {
                System.out.println(i + " cubed is " + cube);
            }
        }
    }
}