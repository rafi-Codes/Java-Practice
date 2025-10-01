import java.util.*;

public class print {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x = num & 1;
		if (x == 1){
			System.out.println("odd");
		}else {
			System.out.println("even");
		}
		sc.close();
	}
}