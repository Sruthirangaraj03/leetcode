class Solution {
    public int mostWordsFound(String[] sentences) {
    int n = sentences.length;
    char c = ' ';
    int max=0;
    int count=1;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<sentences[i].length();j++)
        {
            c=sentences[i].charAt(j);
            if(c==' ')
            {
               count=count+1;
            }
        }
        if(max<count)
        {
            max=count;
        }
        count=1;
    }
    return max;  
    }
}