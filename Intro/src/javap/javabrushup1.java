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
MISSING NUMBER IN AN ARRAY

class Main{
    public static void main(String[] args){
        int[] arr = {5,6,8,9};
        int arr_sum = 0;
        for(int i=0;i<arr.length;i++){
            arr_sum += arr[i];
        }
        int original_arr_sum = 0;
        for(int i =5;i<=9;i++){
            original_arr_sum += i;
        }
        System.out.println("Missing element is " + 
        (original_arr_sum - arr_sum));
    }
}





