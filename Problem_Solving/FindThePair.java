
/**
 *Given an array A[] and a number x, check for pair in A[] with sum as x
 *
 */
public class FindThePair {

	
	public static void main(String[] args) {
		int[] array = {-2,0,3,7,18,23,45,78};
		 int count = 0;
		
		int sum = 10;
		
		int startIndex = 0;
		int lastIndex = array.length-1;
		int min = array[0];
		int max = array[array.length-1];
		while (min != max) {
			int calc = min + max;
			count++;
			if (calc == sum) {
				System.out.println(min + ".." + max +"   in >>" + count);
				return;

			} else if (calc > sum) {
				lastIndex--;
				max = array[lastIndex];
				continue;
			}
			else if (calc < sum){
				startIndex++;
				min = array[startIndex];
				continue;
			}
		}
	}
}
