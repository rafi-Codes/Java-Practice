import java.util.Scanner;

public class codeforces {
    public static int intConvert (String num) {

        if (num.length() == 1) {
           if (num.charAt(0) == '-') return -1;
           else if (num.charAt(0) == '+') return 1;
        }

        int sum = 0;
        int sign = 1;

        if(num.charAt(0) == '-') {
            sign = -1;
        }

        for (int i = 0; i < num.length(); i++){
            if (num.charAt(i) == '-' || num.charAt(i) == '+') continue;
            sum = sum * 10 + (num.charAt(i) - 48);
        }

        return sum * sign;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++){
            String StrNum = "";
            while (i < str.length()){
                if (str.charAt(i) == 'x'){
                    x += intConvert(StrNum);
                    break;
                }
                if (str.charAt(i) == 'y'){
                    y += intConvert(StrNum);
                    break;
                }
                StrNum += str.charAt(i);
                i++;
            }
        }
        
        if (x != 0) System.out.print(x+"x");
        if (y != 0) {
            if (y > 0) System.out.println("+"+y+"y");
            else System.out.println(y+"y");
        }   
    }
}
