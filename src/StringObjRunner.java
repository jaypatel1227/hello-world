public class StringObjRunner
{
	public static void main(String[]args)
	{
		StringObj bob = new StringObj("bob");
		StringObj cat = new StringObj("the dog is bob dog doggedly ");
		StringObj test = new StringObj("Dog faced Dogbert ran doggedly into the dog house to study endogamous dogma.");
		System.out.print(bob + "\n" + cat.getNumVowels() + "\n" + cat.isPalindrome() + "\n");
		System.out.println(test.wordCount("dog"));
	}
}