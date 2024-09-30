package linearsearch;

public class maxElement {
	public static void main(String[] args) {
		int arr[]= {1,3,5,2,6,8,0,8};
		int rs=findMax(arr);
		System.out.println("Maximum Element in an array is "+rs);
		
	}

	private static int findMax(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[0])
				max=arr[i];	
		}
		return max;
	}

}
