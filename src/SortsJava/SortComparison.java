package SortsJava;

import java.util.Scanner;
import java.util.Random;

class Main {

	public static void main(String[] args) {
        
		Scanner s = new Scanner(System.in);
		Random r=new Random();
		System.out.print("Input Array Length: ");
		int len = s.nextInt();
		int[] n = new int[len];
		final int RUNS = 40;
		float stotalTime = 0, itotalTime = 0;
		float stotalSwaps = 0, itotalSwaps = 0;
		float stotalComparisons = 0, itotalComparisons = 0;

		double[] sResults;
		double[] iResults;

        //insert sort comparison algorithm here:

		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt();
		}

		int[] b = n.clone();


		long sStartTime = System.nanoTime();
		sResults = Sorts.selectionSort(n);
		long sEndTime = System.nanoTime();
		stotalTime = (float)sEndTime - (float)sStartTime;

		long iStartTime = System.nanoTime();
		iResults = Sorts.insertionSort(b);
		long iEndTime = System.nanoTime();
		itotalTime = (float)iEndTime - (float)iStartTime;


		stotalSwaps = (float)sResults[0];
		stotalComparisons = (float)sResults[1];

		itotalSwaps = (float)iResults[0];
		itotalComparisons = (float)iResults[1];


		System.out.println("Selection Sort: Total Time: " + stotalTime/1_000_000.0 + "ms\n\tAverage time: " + (stotalTime/1_000_000.0)/RUNS + "ms,\n\tavg. swaps: " + stotalSwaps/RUNS + " swaps,\n\tavg. comparisons: " + stotalComparisons/RUNS + " comparisons\n");
	
		System.out.println("Insertion Sort: Total Time: " + itotalTime/1_000_000.0  + "ms\n\tAverage time: " + (itotalTime/1_000_000.0)/RUNS + "ms,\n\tavg. swaps: " + itotalSwaps/RUNS + " swaps,\n\tavg. comparisons: " + itotalComparisons/RUNS + " comparisons\n");
	}
	
}

