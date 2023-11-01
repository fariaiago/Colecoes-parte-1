package br.edu.uft.fariaiago.colecoesparte1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		Scanner stdIn = new Scanner(System.in);
		String entrada;
		while (!"fim".equals(entrada = stdIn.next())) {
			nomes.add(entrada);
		}
		Collections.sort(nomes);
		System.out.println(nomes);
		stdIn.close();
	}
}