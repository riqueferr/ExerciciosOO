package exercicio03;

public class Livro {
	private String titulo;
	private String autor;
	private int numPags;
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}

	public int getNumPags() {
		return numPags;
	}
	
	public Livro(String titulo, String autor, int numPags) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPags = numPags;
	}
}
