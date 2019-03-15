package main;

import java.util.Scanner;
import clases.Array;

/**
 * 
 * @author laura.lopezcasado
 * @since 15-03-2019 
 * @version 1.0.
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Array array = new Array();
		int num;
		boolean encontrado = false;
		
		System.out.println("Introduce un número para buscar en el array");
		num = sc.nextInt();

		encontrado = array.busquedaLineal(num);
		
		if (encontrado) {
			System.out.println("El número ha sido encontrado");
		} else {
			System.out.println("El número no se encontraba en el array ");
		}
		
		sc.close();
	}
}