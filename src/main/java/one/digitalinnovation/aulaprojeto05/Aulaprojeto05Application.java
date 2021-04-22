package one.digitalinnovation.aulaprojeto05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aulaprojeto05Application {

	public static void main(String[] args) {
		SpringApplication.run(Aulaprojeto05Application.class, args);
		System.out.println("Hello Word :D");
		final var condicao = true;

		if(condicao){
			System.out.println("A condição é verdadeira !");
		}else{
			System.out.println("A condição é falsa !");
		}

		final var ternario = condicao ? "é verdadeira" : "é falsa"; // Valor da esquerda caso verdade, direita caso contrário

		System.out.println(" ' if ternário ' = "+ternario);

		var testeInteiros = new Inteiros();

		if(testeInteiros.comparacao(1)){
			System.out.println("Metodo comparação da classe 'Inteiros' está funcionando !");
		}else{
			System.out.println("Não funciona!");
		}

		var testeStrings = new Strings();

		if(testeStrings.comparacao("teste")){
			System.out.println("Metodo comparação da classe 'Strings' está funcionando !");
		}else{
			System.out.println("Não funciona!");
		}


		System.exit(0); //Encerrando a aplicação

	}

}
