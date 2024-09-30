package linearsearch;

public class ArrayDemo {
	public static void main(String[] args) {
		int a[]= {1,2,5,4,7,8,6,9};
		int target=2;
		int rs=findtarget(a,target);
		System.out.println(rs);
	}

	 static int findtarget(int a[],int target) {
		for(int i=0;i<a.length-1;i++)
		{
			if(target==a[i]) {
				return i;
			}
		}
		return -1;
	}

}
