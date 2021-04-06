package com.senati.eti;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declarar arreglo
		Integer[] numero = new Integer[5];
		
		System.out.println("----------------------------");
		System.out.println(">>>> INGRESO DE N�MEROS <<<<");
		System.out.println("----------------------------");
		
		// Leer los datos para el arreglo
		for (int x = 0; x < numero.length; x++) {
			System.out.print("N�mero " + (x + 1) + ": ");
			numero[x] = sc.nextInt();
		}
		
		// Ordenar de forma ascendente
		Arrays.sort(numero);
		
		System.out.println("--------------------------------------------");
		System.out.println(">>>> N�MEROS ORDENADOS ASCENDENTEMENTE <<<<<");
		System.out.println("--------------------------------------------");
		for (int x = 0; x < numero.length; x++) {
			System.out.println("N�mero " + (x + 1) + ": " + numero[x]);
		
		Arrays.sort(numero, Collections.reverseOrder());
		
		System.out.println("\n---------------------------------------------");
		System.out.println(">>>> N�MEROS ORDENADOS DESCENDENTEMENTE <<<<<");
		System.out.println("---------------------------------------------");
		for (int a = 0; a < numero.length; a++) {
			System.out.println("N�mero " + (a + 1) + ": " + numero[a]);	
			
			
		
			
			
		}
		
		

	}

}
	
}	

