package br.com.alura.alurator.playground.reflexao;

import br.com.alura.alurator.playground.controle.Controle;
//entrada -> API de reflection -> iniciar um objeto da classe em questao
//Saber instanciar um objeto a partir de dados din�micos do usu�rio -> ai que entra a classe<T>
//Nessa classe vamos tentar pegar o Class<T> ela pode: listar atributos,m�todos,construtores ou criar objetos
//Voc� pega por: "Object".getClass / Sintaxe class => .class / Class.forName() 
// A Class<T> � a porta de entrada da API reflection

public class TesteInstanciaObjeto {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// url -> /controle/lista

		// Consegue pegar todos os atributos e objetos da classe controle
		Class<Controle> controleClasse1 = Controle.class;
		
		Controle controle = new Controle();

		//S� vale para class m�e e filhas de Controle
		Class<? extends Controle> controleClasse2 = controle.getClass();
		
		//esse controle pode inferir a qualquer classe, parametrizado para qualquer coisa
		Class<?> controleClasse3 = 
				Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
		// retorna uma object
		Controle objetoControle = controleClasse1.newInstance(); 
		Object objetoControle2 =  controleClasse2.newInstance();
		
		// perguntar se a variavel � do tipo controle
		System.out.println(objetoControle2 instanceof Controle);
		System.out.println(objetoControle instanceof Controle);
		
	}
}
