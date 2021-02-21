package assignment2_HyewonPark;
import java.util.Scanner;
import java.util.Random;

public class ComparingTester2 {
	
	private static int count;
	public static final int NONE = -100;
	
	
	public static void main(String[] args) {	


		Random rands = new Random();
		Scanner in = new Scanner(System.in);
		
		//the array that will be put random 1000 elements, randomly.
		int [] array = new int [10000];
		//this will keep the result of length of path, during one test(total "search" test trial : 1000)
		int [] results = new int [1000];
		//this will save the "average of the 1000 search trial" for 1000 times.
		double [] avg = new double [1000];
		
		//array to save all Ns.
		int [] Ns = new int [1000];
		
		
		for(int i = 0; i < 1000; i++) {
			//reset the count in every trial.
			resetCount();
			
			
			
			/**
			 * choose N and build the sorted array.
			 */
			
			int N = 0;
			//choose the N for this trial.
			
			while(N<100) { 
				N = rands.nextInt(10000);
				
			}
			
			Ns[i] = N;

			
			//insert the N elements in the array.
			for(int j = 0; j<N; j++){
				array[j] = rands.nextInt(N);
			}
			//sort the array.
			selectionSort(array, 0, array.length-1);
			
			
			
	
			/**
			 * choose the random target and search it by binary search. (do it for 1000 time)
			 */
			for(int l = 0; l<1000; l++) {
				int pick = rands.nextInt(N);
				binarySearch (array[pick], array, 0, array.length-1);
				results[l] = getCount();
			}
			
			
			int sum = 0;
			for(int k = 0; k<1000; k++) {
				sum += results[k];
			}

			avg[i] = sum/1000;
		}
		

		System.out.println("Ns");
		
		for(int r = 0; r<1000; r++) {
			System.out.println(Ns[r]);
		}
		
		System.out.println("avgs");
		
		
		for(int m = 0; m<1000; m++) {
			System.out.println(avg[m]);
		}
		
	}
	
	
	
	
	
	
	public static void selectionSort (int[] a, int left, int right) {
		// Sort a[left...right].
		
		for (int l = left; l < right; l++) {
			int p = l; int least = a[p];
			// ... least will always contain the value of a[p].
			for (int k = l+1; k <= right; k++) {
				//int comp = a[k].compareTo(least);
				if (a[k] < least) {
					p = k;  least = a[p];
				}
			}
			if (p != l) {
				a[p] = a[l];  a[l] = least;
			}
		}
	}


	


	public static int binarySearch (int target, int[] a, int left, int right) {

		// Find which if any component of a[left...right] contains target 
		// (where a is sorted).

		int l = left, r = right;

		while (l <= r) {
			addCount();
	
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

	
	
	//setter for count
	public static void addCount() {
		count++;
	}
	//getter for count
    public static int getCount() {
    	return count;
    }
	
    //reset the count
    public static void resetCount() {
    	count = 0;
    }
    
}
