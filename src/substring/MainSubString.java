package substring;

public class MainSubString {

	public static void main(String[] args) {
		MainSubString mss = new MainSubString();
		System.out.println("ja es substring de hola: " + mss.isSubstringAMano("hola", "ja"));
		System.out.println("ol es substring de hola: " + mss.isSubstringAMano("hola", "ol"));
		
	}
	
	public boolean isSubstringAMano(String palabra, String substring){
		boolean result = false;
		
		if (substring.isEmpty()){
			return true;
		}
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == substring.charAt(0)){
				return result || (this.isSubstringAMano(palabra.substring(1), substring.substring(1)));
			}
		}
			
		return false;
	}
}
