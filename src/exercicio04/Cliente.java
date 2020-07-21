package exercicio04;

public class Cliente extends Pessoa {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Cliente(String nome, int idade, String cidadeNascimento, String cpf) {
		super(nome, idade, cidadeNascimento);
		this.cpf = cpf;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println(" CPF: " + this.cpf);
	}
}
