package atividade02;

public class Professor extends Pessoa {
	
	private String disciplina;
	private int siape;
	
	public Professor(String nome, int idade, String cpf, String disciplina, int siape) {
		super(nome, idade, cpf);
		this.disciplina = disciplina;
		this.siape = siape;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public int getSiape() {
		return siape;
	}
	
	public void setSiape(int siape) {
		this.siape = siape;
	}
	
	@Override
	public void exibirDados() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return super.toString() + ", Disciplina: " + disciplina +
				", SIAPE: " + siape;
	}
}
