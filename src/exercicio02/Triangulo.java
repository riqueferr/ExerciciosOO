package exercicio02;

public class Triangulo {

	private double lado;
	private double altura;
	
	
	public double getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		return (this.lado * this.altura)/2;
	}

}
