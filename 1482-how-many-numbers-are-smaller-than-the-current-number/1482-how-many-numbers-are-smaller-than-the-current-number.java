class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    int n=nums.length;
    int[] a = new int[n];
    int max=nums[0],c=0;
    for(int i=0;i<n;i++)
    {
        max=nums[i];
        for(int j=0;j<n;j++)
        {
            if(max>nums[j])
            {
                c=c+1;
            }
        }
    a[i]=c;
    c=0;
    }
      return a;  
    }
}