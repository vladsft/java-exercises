package demo.src;

public class Main {

    public static int next(int x) {
        if (x % 2 == 0) {
            return x / 2;
        } else {
            return 3 * x + 1;
        }
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.print(x + " ");
        while (x != 1) {
            x = next(x);
            System.out.print(x + " ");
        }
    }
}