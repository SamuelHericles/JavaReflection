package br.com.alura.alurator.playground.controle;

public class SubControle extends Controle{

	private SubControle () {}
	private SubControle(String s) {}
	
	public void metodoSubControle1() {
		System.out.println("Excecutando o m�todo subControle.metodoSubControle1");
	}
	
	public String metodoSubControle2() {
		System.out.println("Excecutando o m�todo subControle.metodoSubControle2");
		
		return "retorno do m�todo SubControle.metodoSubControle2";
	}
	
}	
