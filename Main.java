package atividade02;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		 	long matricula = 202308446118L;
	        int soma = calcularSomaDigitos(matricula);
	        int modulo = soma % 3;

	        System.out.println("Matrícula: " + matricula);
	        System.out.println("Soma dos dígitos: " + soma);
	        System.out.println("Módulo 3: " + modulo);
	        System.out.println("------------------------------------------------");
	        
	        System.out.println("Estrutura de dados a ser usada: (ArrayList)");
	        System.out.println("------------------------------------------------");
	        
	        
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Aluno aluno = new Aluno("Matheus Alves", 22, "10904981444", "Ciência da Computação", "202308446118");
		Professor professor = new Professor("Fausto Gominho", 50, "9901234588", "Programação Orientada a Objetos", 3007);
		TecnicoAdministrativo tecAdm = new TecnicoAdministrativo("João Paulo", 25, "12399188232", "Financeiro", "Analista");
		
		System.out.println("\nExibindo métodos toString:");
        System.out.println(aluno);
        System.out.println(professor);
        System.out.println(tecAdm);
		System.out.println("------------------------------------------------");

		
		System.out.println("\nHashCodes:");
        System.out.println("Aluno: " + aluno.hashCode());
        System.out.println("Professor: " + professor.hashCode());
        System.out.println("Técnico: " + tecAdm.hashCode());
        System.out.println("------------------------------------------------");
        
        
        pessoas.add(aluno);
        pessoas.add(professor);
        pessoas.add(tecAdm);
        
        
        System.out.println("\nRecuperando objetos da lista:");
        
        for (Pessoa p : pessoas) {
            p.exibirDados();
		
        }
        System.out.println("------------------------------------------------");
        System.out.println("Verificação da modalidade de trabalho do Técnico Administrativo: ");
        tecAdm.verificarModalidadeTrabalho();
       
	}

	private static int calcularSomaDigitos(long matricula) {
		String str = Long.toString(matricula);
        int soma = 0;
        for (char c : str.toCharArray()) {
            soma += Character.getNumericValue(c);
	}
        return soma;
	}
	
}
