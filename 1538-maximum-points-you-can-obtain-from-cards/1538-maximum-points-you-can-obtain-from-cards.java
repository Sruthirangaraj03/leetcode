class Solution {
    public int maxScore(int[] cardPoints, int k) {
    int lsum=0,rsum=0,maxsum=0, l=k-1,r=cardPoints.length-1;
    for(int i=0;i<k;i++){
    lsum=lsum+cardPoints[i];
    maxsum=lsum;
    }
    while(l>=0){
        lsum=lsum-cardPoints[l];
        l--;
        rsum=rsum+cardPoints[r];
        r--;
        maxsum=Math.max(maxsum,lsum+rsum);
    }
    return maxsum;
    }
}