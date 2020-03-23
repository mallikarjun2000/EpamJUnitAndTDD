package epam.JUnitTesting;

public class RemoveAClass {
	
	public RemoveAClass() {
		// TODO Auto-generated constructor stub
	}
	
	public String removeA(String input) {
		int length = input.length();
		String resultFinal = "";
		
		if(length < 2)
		{
			if(length == 1)
			{
				if(input != "A")
					resultFinal = input;
			}
		}
		else
		{
			if(input.contains("A"))
			{
				char FirstChar = input.charAt(0);
				char SecondChar= input.charAt(1);
				String rem = input.substring(2,length);
				if(FirstChar == 'A' && SecondChar == 'A')
				{
					resultFinal = rem;
				}
				else
				{
					if(FirstChar == 'A')
					{
						resultFinal = SecondChar + rem;
					}
					else
					if(SecondChar == 'A')
					{
						resultFinal = FirstChar + rem;
					}
				}
			}
			else
				resultFinal  = input;
		}
		
		return resultFinal;
	}
}
