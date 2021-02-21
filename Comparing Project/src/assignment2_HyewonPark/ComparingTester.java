package assignment2_HyewonPark;


import java.util.Scanner;
import java.util.Random;


public class ComparingTester {

	public static void main(String[] args) {
		
		Random rands = new Random();
		BST tree = new BST();
		Scanner in = new Scanner(System.in);
		
		
		int [] results = new int [1000];
		double [] avg = new double [1000];
		int [] Ns = new int [1000];
		
	
		
		
		for(int i = 0; i < 1000; i++) {
			
			
			tree.resetCount();
			
			
			/**
			 * Build BST by insertion of N random keys.
			 * (Randomly shuffle numbers of 0 to N-1 and insert them into BST.
			 */
			
			
			//deciding N(size of the tree)
			int N = 0;
			while(N<100) { 
				N = rands.nextInt(10000);
			
			}//this makes sure that N is from 100 to 10,000
			
			Ns[i] = N;
			
			
			//building BST
			for(int j = 0; j<N; j++){
				int key = rands.nextInt(N);
				tree.insert(key);
			}
			
			
			/**
			 * Randomly pick a node in the BST
			 * and search it. (Also computes the path length.)
			 */
			for(int l = 0; l<1000; l++) {
				int pick = rands.nextInt(N);
				tree.search(pick);
				results[l] = tree.getCount();
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

}


