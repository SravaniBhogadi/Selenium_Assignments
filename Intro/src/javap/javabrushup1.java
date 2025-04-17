REVERSE A STRING
	
public class RevStr{
	public static void main(String[] args) {
		System.out.println(revStr("chiku"));
		
	}
	
	public static String revStr(String str) {
		String rev = "";
		for(int i = str.length()-1; i>=0 ;i--) {
			rev += str.charAt(i);
		}
		return rev;
	}
	
}

--------------------------
	
GENERATING A RANDOM NUMBER

import java.util.Random;

class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println(randomInt);
    }
}

-------------------------






