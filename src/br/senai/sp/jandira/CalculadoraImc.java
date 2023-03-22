package br.senai.sp.jandira;

import java.util.Scanner;

public class CalculadoraImc {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		
		String nome = teclado.nextLine();
		
		System.out.println("Qual o seu peso?");
		
		double peso = teclado.nextDouble();
		
		System.out.println("Qual a sua altura?");
		
		double altura = teclado.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.println("Olá " + nome + "! Seu IMC é " + imc );
		

	}

}
