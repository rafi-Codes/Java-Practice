import java.util.Scanner;

public class reverseDigit{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int revNum = 0;
		while (num != 0){
             revNum += num % 10;
             num /= 10;
             if (num != 0) 
             	revNum *= 10;
		}
		System.out.println(revNum);
		sc.close();
	}
}