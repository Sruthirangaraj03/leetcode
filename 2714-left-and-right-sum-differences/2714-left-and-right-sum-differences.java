class Solution {
    public int[] leftRightDifference(int[] nums) {
     int n=nums.length;
     int [] a=new int[n];
     int [] b=new int[n];
     int [] c=new int[n];
     int s=0;
     for(int i=0;i<n;i++)
     {
           a[i]=s;
           s=s+nums[i];
     }
     s=0;
     for(int i=n-1;i>=0;i--)
     {
        b[i]=s;
        s=s+nums[i];
     }
    for(int i=0;i<n;i++)
    {
        c[i]=Math.abs(a[i]-b[i]);
    }
    return c;
    }
}