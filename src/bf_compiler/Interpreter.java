package bf_compiler;

import java.util.Scanner;

public class Interpreter 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("BF Intterpreter 1.0");
		System.out.println("Press Ctrl + C to exit");
		int tape[] = new int[30000];
		int pointer = 0;
		while (true)
		{
			System.out.print("BF>");
			String command = input.nextLine();
			
			int tracker = 0;
			for(int i = 0; i<command.length(); i++)
			{
				char currentChar = command.charAt(i);
				if(currentChar == '[')
				{
					tracker++;
				}
				else if(currentChar == ']')
				{
					tracker--;
				}
			}
			if(tracker>0)
			{
				System.out.println("You are missing "+tracker+" ]");
			}
			if(tracker<0)
			{
				int missing = tracker/-1;
				System.out.println("You are missing "+missing+" [");
			}
			
			for(int i = 0; i<command.length(); i++)
			{
				char currentChar = command.charAt(i);
				switch(currentChar)
				{
					case '>':
						break;
					case '<':
						break;
					case '+':
						break;
					case '-':
						break;
					case '.':
						break;
					case ',':
						break;
					case '[':
						break;
					case ']':
						break;
				}
			}
			
		}

	}

}
