import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 */

/**
 * @author CONSULTANT
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = -10;
		int max = 10;
		List<Integer> numbers = new ArrayList<Integer>();
//		int A[] = { -1,3,-4,5,1,-6,2,1};
		for(int i = 0 ; i<1000; i++) {			
			numbers.add(ThreadLocalRandom.current().nextInt(min,max + 1));			
		}
		
		int A[] = { 4,6,2,2,6,6,4};
//		Integer A[] = numbers.toArray(new Integer[numbers.size()]);
		Date init = new Date();
		//System.out.println(Solution.solution(A).toString());
		for(int i=0;i<10;i++) {
			System.out.print(Solution.solution(A)+"/");
		}
		System.out.println("");
		
		Date end = new Date();
		System.out.println(end.getTime() - init.getTime());
		
		Date init1 = new Date();
		for(int i=0;i<10;i++) {
			System.out.print(Solution.solution1(A)+"/");
		}
		System.out.println("");
		Date end1 = new Date();
		System.out.println(end1.getTime() - init1.getTime());
		
	}


	
}
