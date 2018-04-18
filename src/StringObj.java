public class StringObj {
	private String str;
	private int vow;
	public StringObj(String s){ // works
		str = s;
		vow = 0;
		String[] cop = lowerCase(split(s));
		for (int i = 0; i < cop.length; i ++){
			if (cop[i].equals("a") || cop[i].equals("e") || cop[i].equals("i") || cop[i].equals("o") || cop[i].equals("u")){
				 vow ++;
			}
		}
		
	}
	public String toString(){ 
		return this.str;
	}
	public int getNumVowels(){
		return vow;
	}
	public boolean areAlphabetized(StringObj str){ // works
		String thisstr = convert(lowerCase(split(this.str)));
		String strstr = convert(lowerCase(split(str.str)));
		if (thisstr.length() == strstr.length()){
			if (thisstr.compareTo(strstr) <= 0){
				return true;
			}
		}
		else{
			if(thisstr.length() >= strstr.length()){
				if(thisstr.substring(0, strstr.length() + 1).compareTo(strstr) < 0){
					return true;
				}
			}
			else{
				if(thisstr.compareTo(strstr.substring(0 , thisstr.length() + 1)) < 0){
					return true;
				}
			}
		}
		return false;

	}
	public boolean isPalindrome(){ // works
		boolean palin = true;
		String[] thisChar = split(this.str);
		for (int i = 0; i < thisChar.length/2; i++){
			if(!thisChar[i].toLowerCase().equals(thisChar[thisChar.length - 1 - i].toLowerCase())){
				palin = false;
			}
		}
		return palin;
	}
	public boolean isPalindromeBONUS(){
		boolean palin = true;
		String thisChar = convert(clean(lowerCase(split(this.str))));
		for (int i = 0; i < thisChar.length()/2; i++){
			if(thisChar.charAt(i) == thisChar.charAt(thisChar.length() - 1 - i)){
				continue;
			}
			else{
				palin = false;
			}
		}
		return palin;
	}
    public int wordCount(String str){
        int count = 0; 
        String check = convert(lowerCase(split(str)));
        String cop = convert(lowerCase(split(this.str)));
        if (cop.substring(0, str.length() + 1).equals(check + " ")){
            count ++;        
        }
        if (cop.substring(cop.length() - (str.length() + 2)).equals(" " + check + ".")){
            count ++;
        }
        while (cop.indexOf(" " + check + " ") != -1){
			count ++;
			cop = cop.substring(cop.indexOf(" " + check + " ") + str.length());
		}
		return count;
    }
	public int wordCountBONUS(String str){ // works
		int count = 0;
		String check = convert(lowerCase(split(str)));
		String cop = convert(lowerCase(split(this.str)));
		while (cop.indexOf(check) != -1){
			count ++;
			cop = cop.substring(cop.indexOf(check) + str.length());
		}
		return count;
	}
	private static String[] clean(String[] a){
		int flag = 0;
		int count = 0;
		for(int i = 0; i < a.length; i++){
			if (a[i].equals(",") || a[i].equals(".") || a[i].equals(":") || a[i].equals(";") || a[i].equals("\'") || a[i].equals(" ")){
				count ++;
			}
		}		
		String[] res = new String[a.length - count];
		for(int i = 0; i < a.length; i++){
			if (!a[i].equals(",") && !a[i].equals(".") && !a[i].equals(":") && !a[i].equals(";") && !a[i].equals("\'") && !a[i].equals(" ")){
				res[i + flag] = a[i];
			}
			else{
				flag --;
			}
		}
		return res;
	}
	private static String[] lowerCase(String[] a){
		for(int i = 0; i < a.length; i++){
			a[i] = a[i].toLowerCase();
		}
		return a;
	}
	private static String[] split(String s){
		String[] res = new String[s.length()];
		for (int i = 0; i < s.length(); i++){
			res[i] = "" + s.charAt(i);
		}
		return res;
	}
	private static String convert(String[] toConvert){
		String res = "";
		for (String i : toConvert){
			res += i;
		}
		return res;
	}
}
