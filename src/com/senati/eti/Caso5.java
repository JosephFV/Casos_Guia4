package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// { (ALT + 123)
		// } (ALT + 125)
		String[] arrCodigo = {"A-123", "A-456", "A-789", "A-777"};
		String[] arrNombre = {"Joe Castillo", "Rosa Flores", "Karla Ramos", "R"};
		int[] arrNota = {15, 12, 17, 8};
				
		System.out.println("---------------------------");
		System.out.println(">>>> BÚSQUEDA DE DATOS <<<<");
		System.out.println("---------------------------");
		System.out.print("Ingrese código");
		System.out.print("\n>>> ");
		String codigo = sc.nextLine(); // A-456
		
		int p = -1;
		String estado = "";
		
		for (int x = 0; x < arrCodigo.length; x++)
			if (codigo.equals(arrCodigo[x])) {
				p = x;
				break;
			
		}
			
			
        
		
		if (p == -1) {
			System.out.println("\n-------------------------------");
			System.out.println(">>>> Código no encontrado! <<<<");
			System.out.println("-------------------------------");
		}
		
		else {
			System.out.println("\n----------------------------");
			System.out.println(">>>> Código registrado! <<<<");
			System.out.println("----------------------------");
			System.out.println("Código.......: " + arrCodigo[p]);
			System.out.println("Alumno.......: " + arrNombre[p]);
			System.out.println("Nota.........: " + arrNota[p]);
					
			if (arrNota[p] >= 13)
				System.out.println("Estado.......: Aprobado");
			else
				System.out.println("Estado.......: Desaprobado");	
				
				
		}
	
	
   }	

}