/**
 * @author Drew Isaacson
 * 
 * Assignment Instructions:
 * 	- Right click on the src folder and create a new package.
 * 	- Name the package "lastName_firstName", replacing lastName with your last name and firstName with your first name.
 * 	- Inside that package, create a new class "Exercises".
 *    - YOU SHOULD ONLY BE MAKING CHANGES IN THIS PACKAGE
 * 	- Create a javadoc comment at the top with the '@author' tag with your name next to it (do this for all classes you create)
 * 	- Create the following static methods:
 * 		- int threeAndFive() : Returns the sum of all the multiples of 3 or 5 below 1000
 * 		- int evenFibSum() : Returns the sum of the even-valued terms less than 4 million in the Fibonacci Sequence
 * 		- int largestPrimeFactor() : Returns the largest prime factor of the number 600851475143
 * 	- Create a separate Driver class and test your program by outputting the answers to your static methods
 *
 * Submission Instructions:
 *  - Save your saved work on Eclipse - your workspace should be the file location of the cloned repo
 *  - In GitHub Desktop, add your summary and commit your changes
 *  - Then push your commits to GitHub
 *  - Go to your repo on GitHub.com
 *  - Click "New pull request"
 *  - Click "Create pull request"
 *  - In the summary for your request, put your first and last name
 *  - Send the request
 * 
 * 
 */
package isaacson_drew;

public class Exercises 
{
	public static int threeAndFive()
	{
		int sum = 0;
		for (int i = 1; i < 1000; i++)
		{
			if(i%3 == 0 || i%5 == 0)
				sum+=i;
		}

		return sum;
	}
	
	public static int evenFibSum()
	{
		int num1 = 1;
		int num2 = 1;
		int sum = 0;
		for(int i = 0; num2 < 4000000; i++)
		{
			int temp = num2;
			num2 = num1 + num2;
			num1 = temp;
			if(num2 % 2 == 0)
				sum += num2;
		}
		return sum;
	}
	
	public static int largestPrimeFactor()
	{
		long num = Long.parseLong("600851475143");
		long temp = num;
		int factor = 1;
		for(int i = 2; i <= num; i++)
		{
			if(num%i == 0)
			{
				factor = i;
				num /= i;
				i=2;
			}
		}
		return factor;
		
		
	}
}
