import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Collections;

public class arrayList{
    public static void main(String[] args){
       Scanner  sc = new Scanner(System.in);
       ArrayList <Integer> numbers = new ArrayList <Integer> ();
       int n = sc.nextInt();
       for (int i = 0; i < n; i++){
           int temp = sc.nextInt();
           numbers.add(temp);
       }
       System.out.println(numbers);
       System.out.println("Enter the index you want to remove : ");
       int idx = sc.nextInt();
       numbers.remove(idx);
       numbers.sort(Comparator.naturalOrder()); /// Sort using Comparator class
       System.out.println(numbers);
       System.out.println("Enter the index you want to print : ");
       idx = sc.nextInt();
       System.out.println(numbers.get(idx));
       System.out.println("Size of the list : " + numbers.size());
       System.out.println("Enter the index you where u want to add element : ");
       idx = sc.nextInt();
       System.out.println("Enter the element u want to add : ");
       int elm = sc.nextInt();
       numbers.add(idx,elm);
       System.out.println(numbers);
       Iterator it = numbers.iterator();
       while(it.hasNext()){
       	System.out.print(it.next() + "  ");
       }
       System.out.println();
       System.out.println("Enter the value, which index u wanna get");
       elm = sc.nextInt();
       System.out.println(numbers.indexOf(elm));
       System.out.println("Enter the index where u want to change element : ");
       idx = sc.nextInt();
       System.out.println("Enter the element : ");
       elm = sc.nextInt();
       numbers.set(idx,elm);
       System.out.println(numbers);
       Collections.sort(numbers,Collections.reverseOrder()); // Sort using Collections Class
       System.out.println(numbers);
       sc.close();
    }
}