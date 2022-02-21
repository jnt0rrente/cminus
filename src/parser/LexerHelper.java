package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str) {
		try {
			if (str.equals("'\\n'")) {
				return '\n';
			} else if (str.equals("'\\t'")) {
				return '\t';
			} else if (str.equals("'\\r'")) {
				return '\r';
			} else if (str.length() == 3) {
				return str.charAt(1);
			} else if (str.charAt(1) == '\\') {
				String noQuotes = str.split("'")[1];
				String noSlash = noQuotes.split("\\\\")[1];
				int asciiValue = Integer.parseInt(noSlash);
				return (char) asciiValue;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return '\0';
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}
}
