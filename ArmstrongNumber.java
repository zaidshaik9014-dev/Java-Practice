import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n, sum = 0, dig = 0;

        int t = n;
        while(t != 0) {
            dig++;
            t /= 10;
        }

        while(temp != 0) {
            int d = temp % 10;
            sum += Math.pow(d, dig);
            temp /= 10;
        }

        if (sum == n) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}