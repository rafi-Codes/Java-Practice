import java.util.Scanner;

public class caseChecker{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (Character.isUpperCase(ch)){
			System.out.println("Upper");
		} else{
			System.out.println("Lower");
		}
		sc.close();
	}
}