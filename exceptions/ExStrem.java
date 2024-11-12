package exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExStrem {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// List<Integer> somaPar = numeros.stream().filter(n -> n % 2 ==
		// 0).collect(Collectors.toList());

		int somaPar = numeros.stream().filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b);

		System.out.println("Números pares: " + somaPar);

		// ex do pedro
		// List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

}
