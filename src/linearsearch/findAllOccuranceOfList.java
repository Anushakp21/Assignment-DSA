package linearsearch;

import java.util.ArrayList;
import java.util.List;

public class findAllOccuranceOfList {
	public static void main(String[] args) {
		  int[] numbers = {10, 20, 30, 20, 40, 50, 20};
	        int target = 20;
	        List<Integer> occurrences = findAllOccurrences(numbers, target);
	        System.out.println("All occurrences of " + target + " are at indices: " + occurrences);
	   
	}

	private static List<Integer> findAllOccurrences(int[] numbers, int target) {
		  List<Integer> indices = new ArrayList<>();
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == target) {
	                indices.add(i);
	            }
	        }
	        return indices;
	}

}
