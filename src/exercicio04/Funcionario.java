package exercicio04;

public class Funcionario extends Pessoa{
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public Funcionario(String nome, int idade, String cidadeNascimento, int matricula) {
		super(nome, idade, cidadeNascimento);
		this.matricula = matricula;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println(" Matricula: " + this.matricula);
	}
}
