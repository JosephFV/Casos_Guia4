package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declarar el arreglo
		int[] numero = new int[5];
		
		System.out.println("----------------------------");
		System.out.println(">>>> INGRESO DE NÚMEROS <<<<");
		System.out.println("----------------------------");
		
		// Leer los datos para el arreglo
		for (int x = 0; x < numero.length; x++) {
			System.out.print("Número " + (x + 1) + ": ");
			numero[x] = sc.nextInt();
		}

	}

}
