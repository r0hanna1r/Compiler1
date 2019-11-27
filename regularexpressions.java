package lab1;

import java.util.regex.*;

public class regularexpressions
{
	public String type="Identifiers";
	void changetype(String token)
	{
		if(Pattern.matches(",",token))
		{
			type="";
		}
		
		else if(Pattern.matches(";",token))
		{
			type="";
		}
		
		else if(Pattern.matches("\\+|\\*|-|\\/|%",token)) 
		{
			type="Arithmetic operators";	
		}
		
		else if (Pattern.matches("|||&&|!=|==",token))
		{
			type="Logical operstors";
		}
		
		else if(Pattern.matches("=",token))
		{
			type="Assignment operator";
		}
		
		else if(Pattern.matches("\\(",token))
		{
			type="Left paranthesis";
		}
		

		else if(Pattern.matches("\\)",token))
		{
			type="Right paranthesis";
		}
		

		else if(Pattern.matches("\\{",token))
		{
			type="Left curly braces";
		}
		
		else if(Pattern.matches("\\}",token))
		{
			type="Right curly braces";
		}
		

		else if(Pattern.matches("integer|char|string|float",token))
		{
			type="datatypes";
		}
		
		else if(Pattern.matches("var|main",token))
		{
			type="Keywords";
		}
		
		
		else if(Pattern.matches("input",token))
		{
			type="input function";
		}
		
		else if(Pattern.matches("output",token))
		{
			type="Output function";
		}
		
		else
		{
			type="Identifiers";
		}
	}
}