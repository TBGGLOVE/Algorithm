class Solution {
    public int solution(int n, int k) {
       
        int yang_ggochi = n*12000;
        int umryo = k*2000;
        
        if (n >= 10 ){
            int a = n/10;
            umryo -= a*2000;
        }
        
        return yang_ggochi + umryo;
    }
}