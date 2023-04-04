class Solution {
    public int solution(int num1, int num2) {
        float fnum = (float)num1;
        float fnum2 = (float)num2;
        float result = ((fnum/fnum2)*1000);
        int result2 = (int)result ; 
        return result2;
    }
}