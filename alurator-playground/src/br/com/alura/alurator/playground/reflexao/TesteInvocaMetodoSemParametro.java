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
	
	//Classe principal
	public static void main(String[] args) throws Exception {
	
		//Recebe o endere�o da classe
		Class<?> subControleClasse = 
				Class.forName("br.com.alura.alurator.playground.controle.SubControle");
		
		//Recebe o endenre�o do construtor
		Constructor<?> construtorPadrao = 
				subControleClasse.getDeclaredConstructor();
		
		//Habilita para visualizar
		construtorPadrao.setAccessible(true);
	
		//Abre uma inst�ncia da classe
		Object subControle = construtorPadrao.newInstance();
				
		// Retorna todos os m�todos publicos usados pela class, sub classe e outras 
		for  ( Method m : subControleClasse.getMethods()){
			System.out.println(m);
		}
		
		System.out.println();
		
		// Retorna todos os m�todos n�o publicos usados pela class, sub classe e outras 
		for (Method m : subControleClasse.getDeclaredMethods()) {
			System.out.println(m);
		}
		
		System.out.println();
		
		//Retorna os m�todos das classes declarados
		Method m =  subControleClasse.getDeclaredMethod("metodoSubControle1");
		m.setAccessible(true);
		//Instacia esses m�todos
		Object retorno =  m.invoke(subControle);
		
		//Mostra o endere�o de todos eles
		System.out.println(retorno);
		
	}
}
