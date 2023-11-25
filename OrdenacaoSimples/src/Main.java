
public class Main {

	public static void ordenarLista(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] lista = { 15, 23, -1, -5, 17, 45, 20, 0, 1 };

		System.out.println("Lista antes da Ordenação Simples:");
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
		System.out.println("");
		ordenarLista(lista);
		System.out.println("Lista depois da Ordenação Simples:");
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
	}
}
