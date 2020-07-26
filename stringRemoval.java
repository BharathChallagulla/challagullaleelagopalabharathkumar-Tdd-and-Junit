package tdd_junit;
public class stringRemoval{
	public String removeChar(String str){

		String string = str;
		int len = str.length();
		if(len>=2) {
			if(str.charAt(0) == 'A' && str.charAt(1) == 'A')
                string = string.substring(2);
			else if(str.charAt(0) == 'A' && str.charAt(1) != 'A')
                string = string.substring(1);
			else if(str.charAt(0) != 'A' && str.charAt(1) == 'A')
                string = string.substring(0,1) + string.substring(2);
		}
		else if(len == 1) {
			string = str.charAt(0) == 'A' ? "" : result; 
		}
		return string;
	}
}