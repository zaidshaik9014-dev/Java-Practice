import java.util.*;
public class FrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of array elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element for frequency: ");
        int x = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == x)
                count++;
        }

        System.out.println(count);
    }
}