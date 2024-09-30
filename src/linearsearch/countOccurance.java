package linearsearch;

public class countOccurance {
	public static void main(String[] args) {
		String str="Linearaaa search";
		char target='a';
		int rs=findOccuranceOfChar(str,target);
		System.out.println("Number of Occurance of a "+target+" is "+rs);
		
	}

	private static int findOccuranceOfChar(String str, char target) {
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==target)
			{
			count++;	
			}
		}
		return count;
	}

}
