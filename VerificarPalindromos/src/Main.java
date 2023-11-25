
public class Main {

	public static boolean palindromos(String palavra) {
		palavra = palavra.toLowerCase();

		int caracteres = palavra.length();

		for (int i = 0; i < caracteres / 2; i++) {

			if (palavra.charAt(i) != palavra.charAt(caracteres - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String check = "Ana";
		
		if(palindromos(check)) {
			System.out.println("A palavra '"+check+"' é um palíndromo.");
		}else {
			System.out.println("A palavra '"+check+"' não é um palíndromo.");
		}
	}

}
