package atividade02;

public class Aluno extends Pessoa{

	private String curso;
	private String matricula;
	
	
	public Aluno(String nome, int idade, String cpf,String curso, String matricula) {
		super(nome, idade, cpf);
		this.curso = curso;
		this.matricula = matricula;
		
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public static int calcularSomaDigitos(long numero) {
	    String str = Long.toString(numero);
	    int soma = 0;
	    for (char c : str.toCharArray()) {
	        soma += Character.getNumericValue(c);
	    }
	    return soma;
	}

	
	@Override
	public void exibirDados() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Curso: " + curso +
				", Matrícula: " + matricula;
	}

}
