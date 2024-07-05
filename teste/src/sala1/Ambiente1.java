package sala1;

public class Ambiente1 {
	public static void main(String[] args) {
		System.out.println("Olá, mundo");
		int variavel = 5;
		if (variavel >=10) {
			System.out.println("Variavel tem o valor " + variavel + ", logo é maior que 10");
		} else {
			System.out.println("Variavel tem o valor " + variavel + ", logo é menor que 10 ");
		}
		for (int x = 0; x < variavel ; x++) {
			System.out.println(x);
		}
	}
}
