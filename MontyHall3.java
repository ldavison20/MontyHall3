import java.util.Scanner;
import java.util.Random;
public class MontyHall3 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("How many times the game should be simulated:");
		int roundnumber = keyboard.nextInt();
		while (roundnumber <= 9)
		{
			System.out.print("That number is not valid. Please enter a number 10 or greater: ");
			roundnumber = keyboard.nextInt();
		}
		while(roundnumber >= 10001)
		{
		 System.out.print("That number is not valid. Please enter a number 10000 or less: ");
		 roundnumber = keyboard.nextInt();
		}
		int rightDoor = rand.nextInt(3) + 1;
		boolean correct = false;
		int swapDoor = 0;
		System.out.print("Which door you would like to pick: ");
		int pick = keyboard.nextInt();
		keyboard.nextLine();
		if (pick == rightDoor)
		{
			correct = true;
			if (rightDoor == 1)
			{
				System.out.println("A goat is in door 2 ");
				swapDoor = 3;
			}
			else if (rightDoor == 2)
			{
				System.out.println("A goat is in door 3 ");
				swapDoor = 1;
			}
			else if (rightDoor == 3)
			{
				System.out.println("A goat is in door 1 ");
				swapDoor = 2;
			}
			
		}
		else
		{
			if(rightDoor ==1 && pick == 2)
			{
				System.out.println("A goat is in door 3");
				swapDoor = 1;
			}
			else if(rightDoor ==1 && pick == 3)
			{
				System.out.println("A goat is in door 2");
				swapDoor = 1;
			}
			else if(rightDoor ==2 && pick == 1)
			{
				System.out.println("A goat is in door 3");
				swapDoor = 2;
			}
			else if(rightDoor ==2 && pick == 3)
			{
				System.out.println("A goat is in door 1");
				swapDoor = 2;
			}
			else if(rightDoor ==3 && pick ==1)
			{
				System.out.println("A goat is in door 2");
				swapDoor = 3;
			}
			else if(rightDoor ==3 && pick ==2)
			{
				System.out.println("A goat is in door 1");
				swapDoor = 3;
			}
		}
		System.out.println("Would you like to swap doors?");
		String swap = keyboard.nextLine();
		if (swap.equals("yes"))
		{
			pick = swapDoor;
		}
	System.out.println("The car was behind door " + rightDoor);
	if (pick == rightDoor)
	{
		System.out.println("You win");
	}
	else
	{
		System.out.println("You lose");
	}
	}

}
