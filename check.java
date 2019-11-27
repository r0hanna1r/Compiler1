package lab1;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException; 


public class check 

{
	public static void main(String[] args)
	
	{	
		
		File f=new File("/home/examuser/Desktop/data.txt");
		dfa DFA=new dfa();
		regularexpressions regular=new regularexpressions();
		Scanner scan = null;
		try {
			scan = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("using dfa");
		String p; 
		
		while(scan.hasNext())
		{
			p=scan.nextLine();
			StringTokenizer defaulttokenizer = new StringTokenizer(p,"()+-/*,;",true);
			while (defaulttokenizer.hasMoreTokens())
			{
				String token=defaulttokenizer.nextToken();
				DFA.changetype(token);
				if (!DFA.type.equals(""))
				{
					System.out.println(token+" "+DFA.type);
				}
			}
		}
		
		
		System.out.println("\nregex"); 		
		scan = null;
		try {
			scan = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while(scan.hasNext())
		{
			p=scan.nextLine();
			StringTokenizer defaulttokenizer = new StringTokenizer(p,"()+-/*,;",true);
			while (defaulttokenizer.hasMoreTokens())
			{
				String token=defaulttokenizer.nextToken();
				regular.changetype(token);
				if (!regular.type.equals(""))
				{
					System.out.println(token+" "+regular.type);
				}
			}
		}
		
		
	}

}