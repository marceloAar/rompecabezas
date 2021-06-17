//Marcelo Aceituno R
//Full Stack JAVA 0034
package com.inforcap.rompecabezas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
	
	//1. Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. 
	//Imprimir la suma de todos los números en el arreglo. 
	//El método también debe retornar un arreglo que incluya solo los números que son mayores a 10 
	//(Por ejemplo cuando envía el arreglo anterior, debe retornar un arreglo con los valores de 13,25,32).

	public ArrayList<Integer> suma() {
		ArrayList<Integer> nuevo = new ArrayList<Integer>();
		int[] arreglo = {3,5,1,2,7,9,8,13,25,32};
		int suma = 0;
			
		for (int i = 0; i<arreglo.length; i++) {
			suma += arreglo[i];
			if(arreglo[i] > 10) {
				nuevo.add(arreglo[i]);
			}			
		}		
		System.out.println("La suma de los numeros del arreglo es: "+suma);
		return nuevo;				
	}
	
	//2. Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
	//Mezcle el arreglo e imprima el nombre de cada persona. 
	//Haga que el método también devuelva un arreglo con los nombres que tienes más de 5 caracteres.
	
	void  mezcla() {
		ArrayList<String> arreglo = new ArrayList<String>();			
		ArrayList<String> nuevo = new ArrayList<String>();
		
		arreglo.add("Nancy");
		arreglo.add("Jinichi");
		arreglo.add("Fujibayashi");
		arreglo.add("Momochi");
		arreglo.add("Ishikawa");
		System.out.println("ARREGLO DE ENTRADA: "+arreglo);
				
        Collections.shuffle(arreglo);             
		
        for (int i=0; i<arreglo.size(); i++) {
        	if(arreglo.get(i).length() > 5) {
        		nuevo.add(arreglo.get(i));
        	}
        }
        System.out.println("ARREGLO MEZCLADO: "+arreglo);
        System.out.println("ARREGLO CON MAS DE 5 CARACTERES: "+nuevo);
		
	}
	
	//3. Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe tener 26 valores). 
	//Mezcle el arreglo y, después de mezclarlo, imprima la última letra del arreglo. 
	//También debe imprimir la primera letra del arreglo. Si la primera letra del arreglo es una vocal, 
	//haga que muestre un mensaje.
	//Para mezclar una colección, puede utilizar el método shuffle de la clase Collections. 
	//Documentación de la Clase Collections.
	
	 ArrayList<Character> abecedario() {
		ArrayList<Character> abc = new ArrayList<Character>();
		
		for (int i=0; i<26 ; i++) {
			abc.add((char)('A'+ i));
		}
				
		System.out.println("ABECEDARIO: "+abc);
		
		Collections.shuffle(abc);
		System.out.println("ABECEDARIO MEZCLADO: "+abc);
		
		System.out.println("ULTIMA LETRA: " +abc.get(25));
		
		if (abc.get(0) == 'A') {
			System.out.println("PRIMERA LETRA: " +abc.get(0) + " ES VOCAL...");
		}else if(abc.get(0) == 'E') {
			System.out.println("PRIMERA LETRA: " +abc.get(0) + " ES VOCAL...");
		}else if(abc.get(0) == 'I') {
			System.out.println("PRIMERA LETRA: " +abc.get(0) + " ES VOCAL...");
		}else if(abc.get(0) == 'O') {
			System.out.println("PRIMERA LETRA: " +abc.get(0) + " ES VOCAL...");
		}else if(abc.get(0) == 'U') {
			System.out.println("PRIMERA LETRA: " +abc.get(0) + " ES VOCAL...");	
		}else 
			System.out.println("PRIMERA LETRA: " +abc.get(0));
		return abc;
	}
	
	 //4. Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100.
	 //Para obtener un número entero aleatorio, puede utilizar el método nextInt de la clase Random. 
	 //Documentación de la Clase Random.
	
	 
	 ArrayList<Integer> aleatorio() {
			ArrayList<Integer> numeros = new ArrayList<Integer>();
	                                                                                   
	        Random num = new Random();
	        
	        for (int i = 0; i < 10 ; i++) {
	             numeros.add(num.nextInt(100 - 55 + 1) + 55);                                                 
	        }
	        return numeros;
	}
	 
	 //5. Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 
	 //y hacer que estén ordenados (mostrar el número más pequeño en el principio del arreglo). 
	 //Imprimir todos los números del arreglo. Luego, Imprimir el valor mínimo del arreglo, así como el valor máximo.
	 //Para ordenar una colección, puede utilizar el método sort de la clase Collections. 
	 
	 ArrayList<Integer> aleatorioOrdenado() {
			ArrayList<Integer> numeros = new ArrayList<Integer>();
	                                                                                   
	        Random num = new Random();
	        
	        for (int i = 0; i < 10 ; i++) {
	             numeros.add(num.nextInt(100 - 55 + 1) + 55);                                                 
	        }
	        
	        Collections.sort(numeros);
	        System.out.println("ARREGLO: "+numeros);
	        
	        System.out.println("VALOR MINIMO: "+numeros.get(0));
	        
	        System.out.println("VALOR MAXIMO: "+numeros.get(9));	        
	        
	        return numeros;
	 }
	 
	 //6. Crear una cadena aleatoria con 5 caracteres de longitud.
	 
	 String cadenaAleatoria() {
			
			Random cad = new Random();
			
			char caracter = ' ';
			String cadena = "";

			for (int i=0; i<5; i++) {
				caracter = (char)(cad.nextInt(25)+97);
				cadena = caracter + cadena;
			}			
			return cadena;
	 }	
	 
	 //7. Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres de longitud.
	 
	 void  arregloAleatorio() {
			//ArrayList<String> alea = new ArrayList<String>();
			String[] arreglo = new String[10];
			//Random cad = new Random();
			
			for (int i = 0; i<10; i++) {
				arreglo[i] = cadenaAleatoria();
				System.out.print(i+1+") "+arreglo[i]+" | ");
			}	
		
	 } 
	 
}
