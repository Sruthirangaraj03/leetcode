class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int l=0,r=k-1,sum=0;
    double maxlen=Double.NEGATIVE_INFINITY;
    for(int i=0;i<k;i++){
        sum=sum+nums[i];
    }
    double avg=(double)sum/k;
    maxlen=Math.max(maxlen,avg);
    while(r<nums.length-1){
     sum=sum-nums[l];
     l++;
     r++;
     sum=sum+nums[r];
     avg=(double)sum/k;
     maxlen=Math.max(maxlen,avg);
    }
    return maxlen;
    }
}