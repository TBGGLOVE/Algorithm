class Solution {
    public int solution(int[] array) {
        
    
        
        for(int i = 0; i<array.length; i++) {
	        	for(int j = i+1; j<array.length; j++) {
                    
                    if(array[i]>array[j]) { //오름차순
	        		int temp = array[i];
	        		array[i] = array[j];
	        		array[j] = temp;
	        	}

	        	}
	        
	        }
            int result = 0;
        
         if (array.length%2==0) { // 짝수면

	        	result = (array.length/2)-1;
	        	
	        }
	        
	        else  {  
	        	result = (array.length/2);
	        	
	        }
        
        
        int realresult = array[result];
        
        return realresult;
        
        
        
    }
}