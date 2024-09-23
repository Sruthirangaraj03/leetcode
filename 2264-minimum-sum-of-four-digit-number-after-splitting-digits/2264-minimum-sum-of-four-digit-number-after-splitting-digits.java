class Solution {
    public int minimumSum(int num) {
    int a[]= new int[4];
    int r=0,i=0;
    while(num!=0){
        r=num%10;
        a[i]=r;
        num=num/10;
        i++;
    }
    Arrays.sort(a);
    int n1=a[0]*10 + a[2];
    int n2=a[1]*10 + a[3];
      return n1+n2;
    }
}