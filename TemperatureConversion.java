import java.util.*;
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextInt();
        System.out.println("Choice 1=C→F, 2=F→C");
        int choice = sc.nextInt();

        if (choice == 1) System.out.println((temp * 9 / 5) + 32);
        else System.out.println((temp - 32) * 5 / 9);
    }
}