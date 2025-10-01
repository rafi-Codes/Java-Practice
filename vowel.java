import java.util.Scanner;

public class vowel{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (Character.isUpperCase(ch)){
			ch = Character.toLowerCase(ch);
		}
		switch(ch){
        	 case  'a' : 
        	 case  'e' : 
        	 case  'i' : 
        	 case  'o' : 
        	 case  'u' : 
        	 System.out.println("Yes"); break;
        	 default : System.out.println("No"); break;
        }
        sc.close();
	}
}