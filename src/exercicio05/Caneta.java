package exercicio05;

public class Caneta {
	private String ehFeitoDe;
	private String escreveCom;
	
	
	public String getEhFeitoDe() {
		return ehFeitoDe;
	}
	public String getEscreveCom() {
		return escreveCom;
	}
	
	public Caneta() {
		this.ehFeitoDe = "Plastico";
		this.escreveCom = "Tinta";
	}
	
	public void escrever() {
		System.out.println("Escreve com " + this.escreveCom);
	}
	
}
