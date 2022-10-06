import java.util.Scanner;

/**
 * @author Khan Lee
 * This class takes two String inputs, any characture in the second line is taken off from first line.
 * The first line is printed at the end, if all the charactures are taken off, it prints "EMPTY".
 */

public class CharBomb {

	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first line.");
		String firstLine = input.nextLine();
		
		System.out.println("Enter second line.");
		String secondLine = input.nextLine();
		
		
		char[] ary1 = new char[firstLine.length()];
		char[] ary2 = new char[secondLine.length()];
		String result = "";
		boolean same = false;
		
		for(int i = 0; i < ary1.length; i++)
		{
			ary1[i] = firstLine.charAt(i);
		}
		
		for(int i = 0; i < ary2.length; i++)
		{
			ary2[i] = secondLine.charAt(i);
		}
		
		for(int i = 0; i < ary1.length; i++)
		{
			for(int j = 0; j < ary2.length; j++)
			{
				if(ary1[i] == ary2[j])
				{
					same = true;
				}	
			}
			
			if(!same)
			{
				result += ary1[i];
			}
			
			same = false;
		}
		
		if(result == "")
		{
			System.out.println("EMPTY");
		}
		else
		{
			System.out.println(result);
		}
		
		
		
	}
}
