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
			int i = 0;
			while(i<command.length())
			{
				char currentChar = command.charAt(i);
				switch(currentChar)
				{
					case '>':
						pointer++;
						if(pointer == 30000)
						{
							pointer = 0;
						}
						break;
					case '<':
						pointer--;
						if(pointer<0)
						{
							pointer = 30000;
						}
						break;
					case '+':
						tape[pointer]++;
						break;
					case '-':
						tape[pointer]--;
						break;
					case '.':
						System.out.println("OUT>" + tape[pointer]);
						break;
					case ',':
						System.out.print("BYTE>");
						tape[pointer] = Integer.parseInt(input.nextLine());
						break;
					case '[':
						break;
					case ']':
						break;
				}
				i++;
			}
			
		}

	}

}
