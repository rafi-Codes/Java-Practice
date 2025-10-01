import java.util.Scanner;

public class voterCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age >= 18){
			System.out.println("Valid Voter");
		}else {
			System.out.println("Invalid Voter");
		}
		sc.close();
	}
}