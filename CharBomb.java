import java.util.Scanner;

/**
 * @author Khan Lee
 *
 */

public class CharBomb {

	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		String firstLine = input.nextLine();
		
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
			System.out.println("FRULA");
		}
		else
		{
			System.out.println(result);
		}
		
		
		
	}
}
