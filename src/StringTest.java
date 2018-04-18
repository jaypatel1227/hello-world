
public class StringTest {
	public static void main(String[] args){
		StringObj a = new StringObj("Dogs is yellow and dog are mellow dog.");
		StringObj b = new StringObj("Gog Bog Dog DOG DoG DOg dOG doG dOg dog.");
		StringObj c = new StringObj("apple");
		StringObj d = new StringObj("Bob");
		StringObj e = new StringObj("apples");
		StringObj f = new StringObj("boboles");
		StringObj g = new StringObj("blue");
		StringObj h = new StringObj("asdfDSA");
		StringObj i = new StringObj(".,: ., . ., . , ., ,. ;'c . . , asdfDSA,.:'; ,. ,. ., ,.  ,. c");
		System.out.println(a.wordCount("DOg")); // 2
		System.out.println(b.wordCount("DOG")); // 8
		System.out.println(a.getNumVowels()); // 11
		System.out.println(b.getNumVowels()); // 10
		System.out.println(c.areAlphabetized(e)); // true
		System.out.println(e.areAlphabetized(d)); // true
		System.out.println(d.areAlphabetized(f)); // true
		System.out.println(d.areAlphabetized(e)); // false
		System.out.println(e.areAlphabetized(f)); // true
		System.out.println(f.areAlphabetized(g)); // false
		System.out.println(h.isPalindrome()); // true
		System.out.println(i.isPalindromeBONUS()); // true
	}
}