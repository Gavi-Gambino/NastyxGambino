

public class NestedLoopForMidTerm {
	
	public static void main (String[] args) {
				for (int row = 1; row <= 5; row++)
			{
				for (int star = 2; star <= 2*row-1; star++)
				{
					System.out.print("*");
				}
				for (int num = 1; num >=row-4; num--)
				{
					System.out.print(row);
				} 
				for (int ex = 1; ex >= 2*row-10; ex--)
				{
					System.out.print("!");
				} 
				for (int num = 1; num >=row-4; num--)
				{
					System.out.print(row);
				} 
				for (int star = 2; star <= 2*row-1; star++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	
	}
}

