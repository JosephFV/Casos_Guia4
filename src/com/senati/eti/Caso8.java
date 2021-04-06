package com.senati.eti;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrNombre = new ArrayList<String>();
		ArrayList<Integer> arrEdad = new ArrayList<Integer>();
		
		String rp = "S", nombre = "";
		int nr = 0, edad = 0;
		
		// Alt + 124 = |
		while (rp.equals("S") || rp.equals("s")) {
			nr++;
			
			System.out.println("\n------------------------------");
			System.out.println(">>>> REGISTRO N. " + "["+nr+"]" + " <<<<");
			System.out.println("------------------------------");
			
			System.out.print("Nombre...: ");
			nombre = sc.nextLine();
			
			System.out.print("Edad.....: ");
			edad = sc.nextInt();
			
			arrNombre.add(nombre);
			arrEdad.add(edad);
			
			sc.nextLine();
			
			rp = "";
			
			while (!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
				System.out.print("¿Continuar con el registro [S/N]?: ");
				rp = sc.nextLine();
				
				if(!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
					System.out.print("Solo escriba S o N");
				}
			}
				
		}
		
		// Impresión del contenido de los ArrayList
		System.out.println("\n---------------------------");
		System.out.println(">>>> DATOS REGISTRADOS <<<<");
		System.out.println("---------------------------");
		
		System.out.println("Alumno(a) \tEdad \t\tEstado");
		System.out.println("---------------------------");
		
		for (int i = 0; i < arrNombre.size(); i++) {
			System.out.println(arrNombre.get(i) + "\t\t" + arrEdad.get(i) + " años\t\t" +
												VerMensaje(arrEdad.get(i)));
		}
				
	}
	
	// Crear métodos 
	// Función (Método que devuelve un valor)
	
	public static String VerMensaje(int edad) {
		String mensaje = "Menor de edad";
		
		if (edad >= 18) mensaje = "Mayor de edad";
		
		return mensaje;		
	}
	
	public static String VerEstado(int edad) {
		// Hasta 10      -> Niñez
		// Hasta 17      -> Adolescente
		// Hasta 24      -> Juventud
		// Hasta 59      -> Adulto
		// De 60 a más   -> Adulto Mayor
		
		return "";
	}
}




















