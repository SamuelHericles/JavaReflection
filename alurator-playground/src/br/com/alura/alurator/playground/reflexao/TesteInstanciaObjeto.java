package br.com.alura.alurator.playground.reflexao;

import br.com.alura.alurator.playground.controle.Controle;
//entrada -> API de reflection -> iniciar um objeto da classe em questao
//Saber instanciar um objeto a partir de dados din�micos do usu�rio -> ai que entra a classe<T>
//Nessa classe vamos tentar pegar o Class<T> ela pode: listar atributos,m�todos,construtores ou criar objetos
//Voc� pega por: "Object".getClass / Sintaxe class => .class / Class.forName() 

public class TesteInstanciaObjeto {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// url -> /controle/lista
		Class<Controle> controleClasse1 = Controle.class;// Consegue pegar todos os atributos e objetos da classe controle
		
		Controle controle = new Controle();
		Class<? extends Controle> controleClasse2 = controle.getClass();//S� vale para class m�e e filhas de Controle
		
		Class<?> controleClasse3 = //esse controle pode inferir a qualquer classe, parametrizado para qualquer coisa
				Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
		Controle objetoControle = controleClasse1.newInstance(); // retorna uma object
		Object objetoControle2 =  controleClasse2.newInstance();
		
		System.out.println(objetoControle2 instanceof Controle);
		System.out.println(objetoControle instanceof Controle);// perguntar se a variavel � do tipo controle
	}
}
