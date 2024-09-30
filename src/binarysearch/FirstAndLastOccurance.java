package binarysearch;

public class FirstAndLastOccurance {
public static void main(String[] args) {
	 int[] sortedArray = {1, 2, 2,2,2, 3, 4, 5};
     int target = 2;

     // Find the first and last occurrence of the target
     int firstIndex = findFirstOccurrence(sortedArray, target);
     int lastIndex = findLastOccurrence(sortedArray, target);

     // Print the results
     System.out.println("First occurrence of " + target + " is at index: " + firstIndex);
     System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
}

private static int findLastOccurrence(int[] sortedArray, int target) {
	int low=0;int high=sortedArray.length-1;
	int result=-1;
	
	while(low<=high)
	{
		int mid =low+(high-low)/2;
		if(sortedArray[mid]==target)
		{
			result= mid;
			low=mid+1;
		}
		else if (sortedArray[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
	}
	return result;
}

private static int findFirstOccurrence(int[] sortedArray, int target) {
    int low = 0, high = sortedArray.length - 1;
    int result = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (sortedArray[mid] == target) {
            result = mid;  
            high = mid - 1;
        } else if (sortedArray[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return result; 
}
}
