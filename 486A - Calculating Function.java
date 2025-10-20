import java.util.Scanner;
 
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); 
        long ans;
        if (n % 2 == 0) {
            ans = n / 2;
        } else {
            ans = -((n + 1) / 2);
        }
 
        System.out.println(ans);
        sc.close();
    }
}
