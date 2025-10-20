import java.util.Scanner;

public class codeforce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int temp = -1;
        while(n-- > 0){
            int mag = sc.nextInt();
            if (temp != mag){
                cnt++;
                temp = mag;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}