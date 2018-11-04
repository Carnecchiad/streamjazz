package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed int String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 2; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String snew = "";
			for(int i = s.length() -1; i >= 0 ; i--) {
				snew += s.charAt(i);
			}
			System.out.println(snew);
		},"repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String snew = "";
			for(int i = 0; i < s.length(); i++) {
				if(i % 2 == 0) {
					snew += Character.toUpperCase(s.charAt(i));
				}else {
					snew += s.charAt(i);
				}
			}
			System.out.println(snew);
		},"repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String snew = "";
			for(int i = 0; i < s.length(); i++) {
				snew+=s.charAt(i) + ".";
			}
			System.out.println(snew);
		},"repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			char[] chararr = s.toCharArray();
			String snew = "";
			for(int i = 0; i < chararr.length; i++) {
				if(!(chararr[i] == 'a' || chararr[i] == 'e' || chararr[i] == 'i' || chararr[i] == 'o' || chararr[i] == 'u')) {
					snew+=chararr[i];
				}
			}
			System.out.println(snew);
		},"repeat");
	
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
