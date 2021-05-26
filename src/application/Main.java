package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		
		System.out.println(lista.size());
		for (String x : lista) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		
		lista.add(2, "Marco");
		
		System.out.println(lista.size());
		for (String x : lista) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		
		lista.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println(lista.size());
		for (String x : lista) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		
		System.out.println("Index of Bob: " + lista.indexOf("Bob"));
		
		System.out.println(lista.size());
		for (String x : lista) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : resultado) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		
		String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);
	}
}
