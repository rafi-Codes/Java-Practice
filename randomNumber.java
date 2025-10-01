import java.util.Random;

public class randomNumber{
	public static void main (String[] args){
		Random randNum = new Random();
		int num = randNum.nextInt(100);
		System.out.println(num);
		num = (int) (Math.random()*10 + 1);
		System.out.println(num);
	}
}