package exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {
		Qualquer pessoaUm = new Qualquer();
		Qualquer pessoaDois = new Qualquer();
		Qualquer pessoaTres = new Qualquer();
		

		pessoaUm.setNome("Henrique");
		pessoaUm.setIdade(25);
		pessoaUm.setCargo("Dev Full Stack Java");
		
		pessoaUm.getAndar();
	}

}