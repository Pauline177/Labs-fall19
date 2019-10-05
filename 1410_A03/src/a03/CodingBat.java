package a03;

public class CodingBat {

	public String zipZap(String str) {
		
		if (str.length() <= 2) return str;
        
	       for (int i = 0; i < str.length()-2; i++)
	        if (str.charAt(i) == 'z' && str.charAt(i+2) == 'p')
	            str = str.substring(0,i+1) + str.substring(i+2);
	    return str;
		
	}

}
