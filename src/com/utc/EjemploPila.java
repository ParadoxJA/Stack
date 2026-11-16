package com.utc;
import java.util.Stack;
public class EjemploPila {

	public static void main(String[] args) {
		Stack<String> historial = new Stack<>();
		
		//insertar elementos
		historial.push("google.com");
		historial.push("github.com");
		historial.push("stackoverflow.com");
		
		//consultar el tope sin eliminarlo
		System.out.println("<Pagina actual: " + historial.peek());
		
		//retirar el elemento superior
		String paginaEliminada = historial.pop();
		System.out.println("Pagina retirada: " + paginaEliminada);
		
		//consultar el nuevo tope
		System.out.println("Pagina anterior: " + historial.peek());
		
		//consultar cantidad y estado
		System.out.println("Cantidad de elementos: " + historial.size());
		System.out.println("¿Está vacia?: " + historial.empty());
		
		

	}

}
