// 1) Crie uma nova classe, pegue c�digo que est� montado na classe anterior e cole. Escolhemos o nome "TestaCondicional2".
// 2) Modifique seu c�digo utilizando || e delete o segundo if, deixando assim.
// 3) Modifique seu c�digo trocando o || por &&. Dessa forma, o comando dentro do if s� ocorrer� caso a idade seja maior ou igual a 18 e quantidadePessoas maior ou igual a 2.
// 4) Crie a vari�vel acompanhado do tipo boolean atribuindo valor true
// 5) Utilize essa vari�vel no if, lembre-se que no Java, quando usamos =, estamos atribuindo, quando usamos == estamos comparando.
// Quando usamos um booleano, n�o precisamos comparar seu valor no if, basta deixar nosso c�digo assim:
// 7) Condicione o valor da vari�vel booleana acompanhado, para isso faremos

public class ExercicioCondicionais {
	public static void main(String[] args){
        System.out.println("testando condicionais");

        int idade = 16;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        if (idade >=18 && acompanhado){
            System.out.println("Seja bem vindo"); 
        } else {
            System.out.println("infelizmente voce nao pode entrar");
        }
	}
}
// A vari�vel booleana ter� valor true quando quantidadePessoas for maior ou igual a 2, e ter� valor false quando ocorrer o contr�ri