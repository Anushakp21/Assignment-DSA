package binarysearch;

public class FindPeekElement {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,5,1};
		int n=arr.length;
		int peek=findPeekElement(arr,n);
		System.out.println("Peek Element is : "+peek);
	}

	 static int findPeekElement(int[] arr,int n) {
		if(n==1)
		{
			return 0;
		}
		if(arr[0]>arr[1])
		{
			return 1;
		}
		if(arr[n-1]>arr[n-2])
		{
			return n-1;
		}
		int low=0;int high=n-2;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(arr[mid] <= arr[mid-1] && arr[mid] >=arr[mid+1])
				return mid;
			else if(arr[mid] >= arr[mid-1])
			{
				low=mid+1;
			}
			else if(arr[mid] >= arr[mid+1])
			{
				high=mid-1;
			}
		}
		
		return -1;
	}

}
