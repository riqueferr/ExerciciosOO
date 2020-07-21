package exercicio07;

public class Exercicio07 {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("v1", 4, 42, 9);
		Veiculo v2 = new Veiculo("v2", 4, 76, 7);

		/*
		 * v1.autonomia(); v2.autonomia();
		 */
		
		v1.abastecer(20);
		v2.abastecer(20);
		
		v1.autonomia();
		v2.autonomia();
	}

}
