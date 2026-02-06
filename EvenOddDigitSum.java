import java.util.*;
public class EvenOddDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//try giving any number like 123456

        int esum = 0, osum = 0;

        while (n != 0) {
            int d = n % 10;
            if (d % 2 == 0) esum += d;
            else osum += d;
            n /= 10;
        }

        System.out.println("Even Sum = " + esum);
        System.out.println("Odd Sum = " + osum);
    }
}