package br.com.fiap.metodos;

import java.util.Scanner;

public class projeto01 {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		// void significa que não retorna nada (caso de função)
		// static é memória estática, pouco utilizado em ambito real
		// quando nesse modo, a memória fará uma ordem em que os códigos serão executados
		
		// main é quem inicia o código
		
		// somente métodos estáticos conseguem ver outros estáticos

		verificar();
		
	}
	
	public static void verificar() {
		int numero = 0;
		System.out.println("Digite um número");
		numero = entrada.nextInt();
		
		// % retorna o resto de uma divisão
		
		if (numero%2 == 1) {
			System.out.println("Número Ímpar");
		} else {
			System.out.println("Número Par");
		}
		
		entrada.close();
	}
}
