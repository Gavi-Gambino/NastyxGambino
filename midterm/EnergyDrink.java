import java.util.Scanner;
import java.text.DecimalFormat;

public class EnergyDrink {

	// Declare all fields
		private int mCaffiene;
		private int mCalories;
		private String mName;
	// Write the constructor method
	public EnergyDrink(String name, int calories, int caffiene)
	{
		mName = name;
		mCalories = calories;
		mCaffiene = caffiene;
	}
	// Write the getter and setter methods
	public String getName()
	{
		return mName;
	}
	public int getCalories()
	{
		return mCalories;
	}
	public int getCaffiene()
	{
		return mCaffiene;
	}
	public void setName(String name)
	{
		mName = name;
	}
	public void setCalories(int calories)
	{
		mCalories = calories;
	}
	public void setCaffiene(int caffiene)
	{
		mCaffiene = caffiene;
	}
	// Write the toString method

	public String toString()
	{
		String output = "Eneregy Drink [" + mName + ", Calories=" +
		mCalories + ", Caffeine =" + mCaffiene + " mg]";
		return output;
	}
	
	
	
	public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);
	choice = keyboard();
	//I honestly forgot the switch statement
	
		// In main method:
		String name;
		int calories,min =9999, max=0, caffiene;
		// Get the choice from the user in a loop
	do{
		System.out.print(
			  "\n********************************************************************\n"
			+ "**                                                                **\n"
			+ "**             WELCOME TO THE \"ENERGIZING\" MIDTERM                **\n"
			+ "**                                                                **\n"
			+ "********************************************************************\n"
			+ "** Please select from the following choices:                      **\n"
			+ "** 1) Create a new Energy Drink                                   **\n"
			+ "** 2) Display statistics of entered Energy Drinks                 **\n"
			+ "** 3) Display shape using nested loops                            **\n"
			+ "** 4) Exit                                                        **\n"
			+ "********************************************************************\n"
			+ ">> ");
		
		
		// Use switch statement for each of the 4 choices
		switch(choice){
		// I tried to switch but forgot the switch statement
		// Choice 1: Prompt the user to enter EnergyDrink name, calories and milligrams of caffeine
		case 1:
		System.out.print("Enter drink name: ");
		drink.nextLine();
		System.out.print("Enter calories: ");
		calories.nextInt();
		System.out.print("Enter caffeine: ");
		caffeine.nextInt();
		//    Increase count of energy drinks by one.
		count++;
		//    Add the caffeine entered to the sum
		
		//    If the caffeine entered is greater than the max, update max.
		if (caffiene > max)
		{
			//not sure what to put
		}
		//    If the caffeine entered is less than the min, update min.
		if(min < caffiene)
		{
				// not sure what to put
		}
		//    Create new EnergyDrink object
		EnergyDrink newEnergyDrink = EnergyDrink("Red Bull",168,111);
		//    Print object to the console
		System.out.println("~~~Energy Drink Entered by User~~~");
		
		System.out.print(newEnergyDrink);
		
	break;
		
		// Choice 2: Display Statistics
	case 2:
		//    Display the average caffeine formatted to 1 decimal place
		//    Display the minimum caffeine formatted to 1 decimal place
		//	  Display the maximum caffeine formatted to 1 decimal place
		System.out.println("\n~~~Energy Drink Caffeine Statistics~~~\n");
		System.out.println("Average Caffeine = ");
		System.out.println("Minimum Caffeine = ");
		System.out.println("Maximum Caffeine = ");
		break;
		
		
		// Choice 3: Nested Loops - write nested for loops to display the pattern specified.
		case 3 :
		System.out.println("\n~~~The Shape You Requested~~~\n");
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
	
	
		
		break;
		
		// Choice 4: Prints the message "Hope your weekend is restful!" and exits the loop.
		case 4:
		System.out.println("Hope your weekend is restful!");
		break;
		default:
		// Anything else (default), prints the message "Error: Please enter a choice between 1-4."
		System.err.println("Error: Please enter a choice between 1-4.");
	break;
}while !=4
	
	}
}

