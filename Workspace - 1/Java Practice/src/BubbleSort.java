import static java.lang.System.*;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		String pattern = "[^ a-zA-Z0-9]";
		
		/*String pattern = "[^ a-zA-Z0-9]";
		String s = "177, Sardar Bhuskutte Mark,Mahajanapeth,Burhanpur,[M.P],India"; 
		String newStr = s.replaceAll(pattern," ");
		out.println(newStr);
		out.println(newStr.replaceAll("[\" \"]{1,5}"," "));
		
		out.println(s.matches("(.*)"+pattern+"(.*)"));
		String s2 = "Rohan Nav";
		out.println(s2.matches("(.*)"+pattern+"(.*)"));*/
		
		String s = "Roger nabe mary (Jones)";
		String newStr = s.replaceAll(pattern," ").replaceAll("[\" \"]{1,5}"," ");
		out.println(newStr);
		//Roger nabe mary Jones 

		
		 

		 
		
	 
		

	}
	
	 

}
