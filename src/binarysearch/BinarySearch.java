package binarysearch;

public class BinarySearch {
public static void main(String[] args) {
	int nums[]= {0,1,2,3,4,5,6,7};
	int target=2;
	int result=binarySearch(nums,target);
	System.out.println("Element Found At Index: "+result);
}

private static int binarySearch(int[] nums, int target) {
	int left=0;
	int right=nums.length-1;
	while(left<=right)
	{
		int mid=(left+right)/2;
		
		if(nums[mid]==target)
		{
			return mid;
		}
		else if(target<nums[mid])
		{
			right=mid-1;
		}
		else 
		{
			left=mid+1;
		}
	}
	return -1;
}
}

