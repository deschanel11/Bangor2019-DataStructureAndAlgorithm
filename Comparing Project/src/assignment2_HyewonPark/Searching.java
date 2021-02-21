package assignment2_HyewonPark;

public class Searching {


	private int count;

	public static final int NONE = -100;  // ... distinct from any array index.


	///////////////////////////////////////////////////////////////////////////////////////////////


	public static int binarySearch (int target, int[] a, int left, int right) {

		// Find which if any component of a[left...right] contains target 
		// (where a is sorted).

		int l = left, r = right;

		while (l <= r) {
			
			
			//addCount();
			
			int m = (l + r)/2;

			
			if (target < a[m])
				r = m - 1;
			else if (target > a[m])
				l = m + 1;


			else  // target == a[m]
					return m;


		}
		return NONE;
	}


	/////////////////////////////////////////////////////////////////////////////////////////////////////



	public static void main (String[] args) {
                                         
		String[] words1 = {"fox", "cow", "pig", "cat", "rat", "lio", "tig", "goa", "dog"};
		
		int left1 = 0, right1 = words1.length - 1;


		String[] words2 = {"cat", "cow", "dog", "fox", "goa", "lio", "pig", "rat", "tig"};
		int left2 = 0, right2 = words2.length - 1;


		String[] testcases = {"ant", "cat", "cow", "dog", "eag", "fox", "goa", "lio", "mou", "pig", "rab", "rat", "she", "tig", "zeb"};


		for (int t = 0; t < testcases.length; t++) {
			String target = testcases[t];
			//System.out.println(target + " " + binarySearch(target, words2, left2, right2));
		}


	}





/*

	//getter for count
	public int getCount() {
		return count;
	}
*/
	//setter for count
	public void addCount() {
		count++;
	}
	
	/*

	public void resetCount() {
		count = 0;
	}


*/




}
