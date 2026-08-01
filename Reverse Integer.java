class Solution {
    public int reverse(int x) {
    long sum=0;
    int mod=0;
    
    while(x!=0){
        mod=x%10;
        sum=sum*10+mod;
        x=x/10;
    }
    if(sum<Integer.MIN_VALUE || sum>Integer.MAX_VALUE){
        return 0;
    }return (int)sum;
    }
}
