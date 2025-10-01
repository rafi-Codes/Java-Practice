import java.util.Scanner;

public class palindromeCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int revNum = 0;
		while (temp != 0){
			revNum = (revNum * 10) + (temp % 10);
			temp /= 10;
		}
		if (revNum == num) System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}
}