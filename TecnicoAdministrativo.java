package atividade02;

public class TecnicoAdministrativo extends Pessoa {
	
	private String setor, cargo;
	private boolean trabalhaRemoto;
	
	public TecnicoAdministrativo(String nome, int idade, String cpf, String setor, String cargo) {
		super(nome, idade, cpf);
		this.setor = setor;
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public boolean isTrabalhaRemoto() {
		return trabalhaRemoto;
	}

	public void setTrabalhaRemoto(boolean trabalhaRemoto) {
		this.trabalhaRemoto = trabalhaRemoto;
	}
	
	public void verificarModalidadeTrabalho() {
        System.out.println("Modalidade de trabalho: " + (trabalhaRemoto ? "Remoto" : "Presencial"));
    }
	
	@Override
	public void exibirDados() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return super.toString() + ", Setor: " + setor +
				", Cargo: " + cargo +
				", Trabalha Remoto: " + (trabalhaRemoto ? "Sim" : "Não");
	}

	
	
	
	
}
