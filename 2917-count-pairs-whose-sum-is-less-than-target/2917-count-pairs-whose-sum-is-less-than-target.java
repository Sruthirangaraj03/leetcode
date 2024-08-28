class Solution {
    public int countPairs(List<Integer> nums, int target)
    {
        int c=0;
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i<j && nums.get(i)+nums.get(j)<target)
                {
                    c=c+1;
                }
            }
        }
        return c;
    }
}