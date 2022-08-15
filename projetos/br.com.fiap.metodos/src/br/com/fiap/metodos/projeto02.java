package br.com.fiap.metodos;

import javax.swing.JOptionPane;

public class projeto02 {
	
	static int opcao, numero1, numero2, resultado;

	public static void main(String[] args) {
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: 1 - adição; 2 - subtração; " +
																 "3 - divisão; 4 - multiplicação; 5 - fechar"));
			
			if (opcao != 5) {
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
				switch (opcao) {
				case 1: 
					somar(numero1, numero2);
					break;
					
				case 2:
					subtrair(numero1, numero2);
					break;
					
				case 3:
					dividir(numero1, numero2);
					break;
					
				case 4:
					multiplicar(numero1, numero2);
					break;
				}
			}
		} while (opcao != 5);

	}
	
	public static void somar(int num1, int num2) {
		resultado = num1 + num2;
		JOptionPane.showMessageDialog(null, "O resultado da soma foi de: " + resultado);
	}
	
	public static void subtrair(int num1, int num2) {
		resultado = num1 - num2;
		JOptionPane.showMessageDialog(null, "O resultado da subtração foi de: " + resultado);
	}
	
	public static void dividir(int num1, int num2) {
		resultado = num1 / num2;
		JOptionPane.showMessageDialog(null, "O resultado da divisão foi de: " + resultado);
	}
	
	public static void multiplicar(int num1, int num2) {
		resultado = num1 * num2;
		JOptionPane.showMessageDialog(null, "O resultado da multiplicação foi de: " + resultado);
	}

}
