class Solution {
    public int[] runningSum(int[] nums) {
     int n=nums.length;
     int s=0;
     int [] a=new int[n];
     for(int i=0;i<n;i++)
     {
        s=s+nums[i];
        a[i]=s;
     }  
    return a;
    }
}