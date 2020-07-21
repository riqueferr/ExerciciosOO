package exercicio07;

public class Veiculo {
	private String nome;
	private int numRodas;
	private double tanque;
	private double consumo;

	
	
	public Veiculo(String nome, int numRodas, double tanque, double consumo) {
		this.nome = nome;
		this.numRodas = numRodas;
		this.tanque = tanque;
		this.consumo = consumo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getNumRodas() {
		return numRodas;
	}


	public void setNumRodas(int numRodas) {
		this.numRodas = numRodas;
	}


	public double getTanque() {
		return tanque;
	}


	public void setTanque(double tanque) {
		this.tanque = tanque;
	}


	public double getConsumo() {
		return consumo;
	}


	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	public double abastecer(double qtdCombustivel) {
		return this.tanque = this.tanque - qtdCombustivel;
	}
	
	public void autonomia() {
		this.consumo = this.consumo * this.tanque;
		System.out.println("Nome: " + this.nome + " Qtde Rodas: " + this.numRodas + " Tanque: " + this.tanque + "L" + " Consumo: " + this.consumo + " km/l");
	}
}
