package String;


	public class Tester {
	    public static String moveSpecialCharacters(String str) {
	        StringBuilder result = new StringBuilder();
	        StringBuilder specialChars = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (!Character.isLetterOrDigit(c)) {
	                specialChars.append(c);
	            } else {
	                result.append(c);
	            }
	        }
	        result.append(specialChars);
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String str = "Hello@#$%^&*";
	        System.out.println("Original string: " + str);
	        System.out.println("Modified string: " + moveSpecialCharacters(str));
	    }
	}


