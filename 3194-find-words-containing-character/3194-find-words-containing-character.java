import java.util.ArrayList;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        
        int n= words.length;
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            //String n1=words[i];
            int c=0;
            for(int j=0;j<words[i].length();j++)
            {
                char a=words[i].charAt(j);
                if(a==x)
                {
                    c++;
                }
            }
            if (c>=1)
            {
                b.add(i);
            }
        }
       return b; 
    }
}