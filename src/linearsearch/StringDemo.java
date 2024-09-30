package linearsearch;

public class StringDemo {
	public static void main(String[] args) {
		String arr[]= {"anu","vaishu","venky","kavya"};
		String target="anu";
		int rs=findString(arr,target);
		System.out.println(rs);
	}

	static int findString(String[] arr, String target) {
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
