package Array;

public class ArrayDemoOne{
	
	public static void main(String[] args) {
	

class ArrayOperations
{
	
	static void printArrays(int[] arr)
	{
		for(int i=0; i<arr.length;i++)
			{
				System.out.println(arr[i] + "\t");
			}
		}
		
		public static int getSum(int... n)
		{
			int sum = 0;
			for(int no : n)
			{
				sum+=no;
			}
				return sum;
			}
			
			public static int getOddCount(int b[])
			{
				int count=0;
				for(int i=0; i<b.length; i++)
				{
					if(b[i] % 2 !=0)
						count++;
				}
				return count;
			}
		}
	}
}



