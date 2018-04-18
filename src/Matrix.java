
public class Matrix{
	public static void main(String[] args){
		int num;
		while (true){
			num = (int)(Math.random()*1000);
			if (num < 500){
				num = 0;
			}
			else{
				num = 1;
			}
			System.out.print(num);
			}
		}
}