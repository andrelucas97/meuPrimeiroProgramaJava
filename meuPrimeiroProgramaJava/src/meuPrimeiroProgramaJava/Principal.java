/**
 * Meu primeiro programa Java
 * 
 * Este programa mostra ao aluno: 
 * 1) Que um programa Java é construido dentro de um projeto Java
 * 2) Todo programa Java deve ter uma classe com um método main
 * 3) Como exibir informações no terminal (console) do Java
 * 4) Como ler uma string do terminal (console) do Java
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author André
 * data: 03/02/2021
 */
public class Principal { 
	public static void main(String[] args) { 
		
		// Saudação e pergunta o nome.
		System.out.println("Ola amigo!\nQual é o seu nome?");
		
		// Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Saudação específica para o nome lido.
		System.out.printf("Olá %s!", nome);
		in.close();
		
		// NOTA: implementar leitura da idade e exibi-la.
	}

}
