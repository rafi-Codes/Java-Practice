import java.util.*;

public class aliBabaPuzzle {
    
    private static long apply(long x, long y, char op) {
        switch (op) {
            case '+': return x + y;
            case '-': return x - y;
            case '*': return x * y;
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }

	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
        long result; 

		char op[] = {'+', '-', '*'};

        for (char op1 : op) {
            for (char op2 : op) {
                if (op1 == op2) continue;
                if (op2 == '*') {
                    result = apply(a, apply(b, c, op2), op1);
                } else if (op1 == '*') {
                    result = apply(apply(a, b, op1), c, op2);
                } else {
                    result = apply(apply(a, b, op1), c, op2);
                }
                if (result == d) {
                    System.out.println("YES");
                    return;
                }
            }
        }
		System.out.println("NO");
		sc.close();
	}
}