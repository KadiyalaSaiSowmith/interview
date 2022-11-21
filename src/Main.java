//converting string into map and getting no.of ocurrances of each character
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String str1 = str.replace(" ","");
        char ch[] = str1.toCharArray();
       // LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<Character,Integer>();
        TreeMap<Character,Integer> hashMap = new TreeMap<Character,Integer>();

        for(int i=0;i<ch.length;i++)
        {

            if(ch[i]==' ')
            {
                continue;
            }
            if(hashMap.containsKey(ch[i]))
            {
                hashMap.put(ch[i],hashMap.get(ch[i])+1);
            }
            else
            {
                hashMap.put(ch[i],1);
            }
        }
        System.out.println(hashMap);
    }

}
