package labs;

import java.util.*;

public class DeafGrandma {

	public static void main(String[] response) {

		System.out.println("Welcome to Grandma's House");

		doLoop();
	}

	
	
	
	
	
	public static void doLoop() {
		Scanner kb = new Scanner(System.in);
		String boyResponse;
		
		do {

			System.out.println("Say something to Grandma.");
				boyResponse = kb.nextLine();
				boolean repo = isUpperCase(boyResponse);

				
			while (repo == false) {

				System.out.println("What was that Junior?  SPEAK UP!");
					boyResponse = kb.nextLine();
				repo = isUpperCase(boyResponse);
			}
			
			String grandmaRe = grandmaResponse();
            System.out.println(grandmaRe);
			
			
		} while (!boyResponse.equals("SMELL YOU LATER!"));
		
		kb.close();
	}
	
	
	
	
	
	
	
	public static boolean isUpperCase(String s) {
			
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isUpperCase(s.charAt(i))) {
					return false;
				}
			}
			return true;
	}

	
	
	
	
	
	
	public static String grandmaResponse() {
        String answers[] = { "NO, NOT SINCE THE WAR.", 
        		             "I REMEMBER THE GREAT DEPRESSION.", 
        		             "I ONCE DATED MILE DAVIS.",
			                 "YOUR FATHER WAS A MISTAKE.", 
			                 "THIS ONE TIME IN BAND CAMP.", 
			                 "OH YES, THOSE WERE THE DAYS.",
			                 "WHERE'S THAT NICE GIRL?", 
			                 "WHAT THE HELL IS JAVA?", 
			                 "YES, YES BEYONCE IS BOOTLICIOUS",
			                 "ZZZZZZZZZZZZZZZZZ" };

        int r = new Random().nextInt(answers.length);

        return answers[r];
    }
}