import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Solution {

	
	public static int solution(int[] A) { //this is the proposed solution
					
		int l = A.length;
		int result = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l ; j++)
                if (A[i] != A[j]) {
                    result = Math.max(result, j - i);
//                    result = result<j-i?j-i:result;
//                    break;
                }
            
        }
        return result;
	}
        public static int solution1(int[] A) {	//this is my solution, I should have taken care about the firs repetition, the "edge" case
		        int result = 0;
		        for (int i = 0; i < A.length; i++) {
		            for (int j = A.length-1; i < j ; j--)
		                if (A[i] != A[j]) {
		                   // result = Math.max(result, j - i);
		                    result = result<j-i?j-i:result;
		                    break;
		                }
		            
		        }
		        return result;
        }
	    
		 //public List solution(int[] A) {
//    public static int solution(int[] A) {
//        // write your code in Java SE 8
//        //List solution = new ArrayList();
//            int solution = -1;
//	        int lowerSum;
//	        int upperSum;
//	        int solutionIndex = 0;
//	        for(int bigLoop = 0; bigLoop<A.length; bigLoop++) {
//	        	lowerSum = 0;
//	        	upperSum = 0;
//	        	for(int lowerIndex = 0; lowerIndex<bigLoop; lowerIndex++) {
//	        		lowerSum = lowerSum + A[lowerIndex];
//	        	}
//	        	for(int upperIndex = bigLoop+1;upperIndex<A.length;upperIndex++) {
//	        		upperSum = upperSum + A[upperIndex];
//	        	}
//	        	if(upperSum == lowerSum) {
//	        		//solution.add(bigLoop);	        		
//	        		solution = bigLoop;
//	        		break;
//	        	}
//	        }
//	        
//	        return solution;
//    }
}