import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//any number from 1 like n = 5

        int a = 0, b = 1;
        for (int i = 1; i<=n; i++) {
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}