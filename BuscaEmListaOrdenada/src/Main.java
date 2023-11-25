
public class Main {

	public static void procurar(int[] lista, int numero) {
		boolean presente = false;
		int pos = 0;

		for (int i = 0; i < lista.length; i++) {

			if (lista[i] == numero) {
				presente = true;
				pos = i;
			}
		}
		if (presente == true) {
			System.out.println("O número '" + numero + "' esta na posição '" + pos + "' da lista.");
		}
		if (presente == false) {
			System.out.println("O número '" + numero + "' não esta presente nesta lista!");
		}
	}

	public static void main(String[] args) {
		int[] lista = { 0, 1, 2, 3, 10, 15, 20, 25 };
		int primeiroNum = 4;
		int segundoNum = 25;

		procurar(lista, primeiroNum);
		procurar(lista, segundoNum);
	}
}
