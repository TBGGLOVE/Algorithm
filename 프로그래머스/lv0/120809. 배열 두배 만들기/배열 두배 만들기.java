class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        answer = numbers;
        
        for (int i = 0 ;  i<numbers.length ; i++)
        {
       numbers[i] =  answer[i]*2;   
        
    }
    return numbers;
}
}