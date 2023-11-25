public class Main {

	public static void fibonacci(int a) {
		int resultado = 0;
		int temp = 1;

		for (int i = 0; i < a; i++) {
			int soma = resultado + temp;
			resultado = temp;
			System.out.println(resultado);
			temp = soma;
		}
	}

	public static void main(String[] args) {
		fibonacci(15);
	}

}