import java.util.ArrayList;

public class method1 {



    public void collectionString(ArrayList<String> str1, ArrayList<String> str2) {

        ArrayList<String> ans = new ArrayList<String>();

        for(int i=0;i<str1.size();i++)
        {
            String so1 = str1.get(i);
            if(str2.contains(so1))
            {

            }
            else
            {
                ans.add(so1);
            }
        }

        for(int i=0;i<str2.size();i++)
        {
            String so2 = str2.get(i);
            if(str1.contains(so2))
            {

            }
            else
            {
                ans.add(so2);
            }
        }
        System.out.println(ans);

        //for(int i=0)
    }
}
