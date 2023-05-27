class Solution {
    public int solution(int angle) {
        int a = 0;
        
        if(0<angle && angle<90){
            a = 1;
            
        }
        else if(angle == 90){
            a = 2;
        }
        else if(90<angle && angle<180){
            a = 3;
        }
        else if (angle == 180){
            a = 4;
        }
        return a;
    }
}