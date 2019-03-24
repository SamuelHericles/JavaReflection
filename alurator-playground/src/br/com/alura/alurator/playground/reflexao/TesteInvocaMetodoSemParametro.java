package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//Classe m�tohd: Listar os tipos de exece��es que pode ser lan�adas, Tipos de par�metros que recebe
//Tipo de retorno,Invocar o m�todos.
//Class<T> recupera qualquer class com getMethods(),getMethod(String nome,Class<?> tipos Args),
//getDeclaredMethods(), getDeclaredMethod(String nome,Class<?> tipos Args). Somente m�todo p�blicos,
//setAccesible(true),

// Method -> invoke(Object obj,Object args)


public class TesteInvocaMetodoSemParametro {
	
	public static void main(String[] args) throws Exception {
	
		Class<?> subControleClasse = 
				Class.forName("br.com.alura.alurator.playground.controle.SubControle");
		
		Constructor<?> construtorPadrao = 
				subControleClasse.getDeclaredConstructor();
		
		construtorPadrao.setAccessible(true);
	
		Object subControle = construtorPadrao.newInstance();
				
		for  ( Method m : subControleClasse.getMethods()){// Retorna todos os m�todos publicos usados pela class, sub classe e outras 
			System.out.println(m);
		}
		
		System.out.println();
		
		for (Method m : subControleClasse.getDeclaredMethods()) {
			System.out.println(m);
		}
		
		System.out.println();
		
		Method m =  subControleClasse.getDeclaredMethod("metodoSubControle1");
		m.setAccessible(true);
		Object retorno =  m.invoke(subControle);
		
		System.out.println(retorno);
		
	}
}
