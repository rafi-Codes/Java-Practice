import java.util.Scanner;

public class fibonacci{
	public static int fib(int n){
		if (n == 0) return 0;
		else if (n == 1) return 1;
		else return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++){
			System.out.print(fib(i));
			if (i!=n-1) System.out.print(", ");
		}
		sc.close();
	}
}  
