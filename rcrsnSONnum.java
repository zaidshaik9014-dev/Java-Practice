import java.util.*;
public class rcrsnSONnum {
    public static void SONnum(int i, int n, int sum) {
        if(i==n) {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        SONnum(i+1, n, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        SONnum(i, n, 0);
    }
}