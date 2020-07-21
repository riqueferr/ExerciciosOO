package exercicio01;

public class Qualquer {
	private String nome;
	private int idade;
	private String cargo;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	public void getAndar() {
		System.out.println("Estou andando!");
	}
	
	public void getPular() {
		System.out.println("Estou pulando!");
	}
	
	public void getDormir() {
		System.out.println("Estou dormindo!");
	}
}
