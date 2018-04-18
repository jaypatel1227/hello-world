import java.util.Scanner;
import java.util.*;
public class AI
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Map<String,String> list = new HashMap<String,String>();
		list.put("Hi","Hello!");
		list.put("How are you?","I am ok, how are you?");
		list.put("Do you have protection?","Yes, I have norton antivirus.");
		list.put("What's your favorite movie?","My favorite movie is Lion King.");
		list.put("","");
		list.put("","");
		String output = "";
		String prompt = input.nextLine();
		while (true)
		{ 
			if (list.containsKey(prompt)){
				output = list.get(prompt);
				System.out.println(output);
			}
			prompt = input.nextLine();
			list.put(output, prompt);
		}
	}
}