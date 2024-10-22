class Solution {
    public boolean isHappy(int n) {
     Set<Integer> c = new HashSet<>();
     int r=0,s=0;
     while(s!=1 && !c.contains(n)){
        c.add(n);
        while(n>0){
            r=n%10;
            n=n/10;
            s=s + r*r;
        }
        if(s==1){
            return true;
        }else{
            n=s;
            s=0;
        }
     }
    return false;  
    }
}