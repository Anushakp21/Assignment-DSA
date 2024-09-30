package binarysearch;

public class FindEleInRoratatedSortedArray {
	public static void main(String[] args) {
		int arr[]= {7,8,9,1,2,3,4,5,6};
		int target=1;
		int rs=findElemenet(arr,target);
		System.out.println("Element found at the Index : "+rs);
	}

	static int findElemenet(int[] arr, int target) {
		int low=0;int high=arr.length-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			
			else if(arr[low]<=arr[mid])
			{
				if(arr[low] <= target && arr[high] >= target )
				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
			else
			{
				if(arr[low] <= target && arr[high] >= target )
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}
		}
		return -1;
	}
}
