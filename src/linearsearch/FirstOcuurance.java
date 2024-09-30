package linearsearch;

public class FirstOcuurance {
	public static void main(String[] args) {
		int arr[]= {1,3,5,2,6,8,0,8};
		int target=8;
		int rs=findFirstOcuurance(arr,target);
		System.out.println(rs);
	}

	private static int findFirstOcuurance(int[] arr, int target) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}

}
