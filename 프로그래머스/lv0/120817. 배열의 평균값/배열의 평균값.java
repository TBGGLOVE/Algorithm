class Solution {
    public double solution(int[] numbers) {
        double sum= 0;
        double sum2 = 0;
        for (int i =0; i<=numbers.length-1; i++){
            sum += numbers[i];
            
        } 
    sum2 = sum/numbers.length;
    return sum2;
        
        
    }
}