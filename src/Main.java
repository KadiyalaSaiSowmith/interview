/*Implement a method that receives two collections of strings then merges both
into one collections of unique elements
and then removes all strings that have a capital 'A'.Print out the result */
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        method1 obj1 = new method1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 String elements in str1 ");
        ArrayList<String> str1 = new ArrayList<String>();
        for(int i=0;i<5;i++)
        {
           String s1 = sc.next();
            str1.add(s1);
        }
        System.out.println("Enter 5 String elements in str2 ");
        ArrayList<String> str2 = new ArrayList<String>();
        for(int i=0;i<5;i++)
        {
            String s2 = sc.next();
            str2.add(s2);
        }
        obj1.collectionString(str1,str2);

    }
}
