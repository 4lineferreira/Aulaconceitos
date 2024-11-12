package aula1111exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;

		do {

			try {

				System.out.println("\nentre com um valor dividendo: ");
				dividendo = scanner.nextInt();

				System.out.println("entre com um valor divisor: ");
				divisor = scanner.nextInt();

				divide(dividendo, divisor);
			} catch (InputMismatchException e) {
				System.err.println("\n Exceção :  " + e);
				scanner.nextLine();
				System.out.println("\n Digite valores inteiros! ");

			}catch (ArithmeticException e ) {
				System.err.println("\n Exceção :  " + e);
				scanner.nextLine();
				System.out.println("\n Divisão invalida ");
				scanner.nextLine();
				System.out.println("O número não pode ser dividido por zero !");
			}finally {
				System.out.println("Essa mensagem vai aparecer sempre e pode fechar o scanner");
				scanner.close();
			}

		} while (loop);

	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
