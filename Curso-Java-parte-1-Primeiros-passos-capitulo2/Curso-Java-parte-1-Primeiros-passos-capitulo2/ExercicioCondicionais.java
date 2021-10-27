// 1) Crie uma nova classe, pegue código que está montado na classe anterior e cole. Escolhemos o nome "TestaCondicional2".
// 2) Modifique seu código utilizando || e delete o segundo if, deixando assim.
// 3) Modifique seu código trocando o || por &&. Dessa forma, o comando dentro do if só ocorrerá caso a idade seja maior ou igual a 18 e quantidadePessoas maior ou igual a 2.
// 4) Crie a variável acompanhado do tipo boolean atribuindo valor true
// 5) Utilize essa variável no if, lembre-se que no Java, quando usamos =, estamos atribuindo, quando usamos == estamos comparando.
// Quando usamos um booleano, não precisamos comparar seu valor no if, basta deixar nosso código assim:
// 7) Condicione o valor da variável booleana acompanhado, para isso faremos

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
// A variável booleana terá valor true quando quantidadePessoas for maior ou igual a 2, e terá valor false quando ocorrer o contrári