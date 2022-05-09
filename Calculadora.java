package primeiroProjeto;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite um número: ");
		a = scan.nextDouble();
		System.out.println("Digite outro número: ");
		b = scan.nextDouble();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("resultado (soma): " + soma);
		System.out.println("resultado (subtração): " + subtracao);
		System.out.println("resultado (multiplicação): " + multiplicacao);
		System.out.println("resultado (divisão): " + divisao);
	}
	
	public static double soma(double a, double b) {
		return  a + b;
	}
	public static double subtracao(double a, double b) {
		return  a - b;
	}
	public static double multiplicacao(double a, double b) {
		return  a * b;
	}
	public static double divisao(double a, double b) {
		return  a / b;
	}

}
