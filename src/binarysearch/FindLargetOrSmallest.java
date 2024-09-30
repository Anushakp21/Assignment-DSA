package binarysearch;

public class FindLargetOrSmallest {
	 public static void main(String[] args) {
	        int[] sortedArray = {1, 2, 3, 5, 6, 8, 9};
	        int target = 7;

	        int smallestIndex = findSmallestGreaterOrEqual(sortedArray, target);
	        if (smallestIndex != -1) {
	            System.out.println("Smallest element greater than or equal to " + target + " is at index: " + smallestIndex);
	        } else {
	            System.out.println("No element found greater than or equal to " + target);
	        }

	        int largestIndex = findLargestSmallerOrEqual(sortedArray, target);
	        if (largestIndex != -1) {
	            System.out.println("Largest element smaller than or equal to " + target + " is at index: " + largestIndex );
	        } else {
	            System.out.println("No element found smaller than or equal to " + target);
	        }
	    }

	private static int findLargestSmallerOrEqual(int[] sortedArray, int target) {
		 int low = 0, high = sortedArray.length - 1;
	        int result = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (sortedArray[mid] <= target) {
	                result = mid; 
	                low = mid + 1; 
	            } else {
	                high = mid - 1;
	            }
	        }

	        return result;
	}

	private static int findSmallestGreaterOrEqual(int[] sortedArray, int target) {
		 int low = 0, high = sortedArray.length - 1;
	        int result = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (sortedArray[mid] >= target) {
	                result = mid; 
	                high = mid - 1;
	            } else {
	                low = mid + 1;
	            }
	        }

	        return result; 
	}

}
