// 1. Crie a vari�vel idade, do tipo inteiro e inicialize com o valor 20.. 
// 2. Escreva um c�digo que teste se a vari�vel idade � maior ou igual a 18, caso verdadeiro, exibiremos uma mensagem, caso falso (else), exibiremos uma outra mensagem. Nosso c�digo deve ficar com essa cara:
// 3. Crie uma vari�vel quantidadePessoas com o valor 3.
// 4. Adicione mais um if ap�s o else no nosso c�digo para testar se essa pessoa est� acompanhada ou n�o, ficando assim:

public class ExercicioIf {
	public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;

        if (idade >= 18) {

            System.out.println("Voc� tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("voce nao tem 18, mas pode entrar, pois est� acompanhado");
            } else {

                System.out.println("infelizmente voce nao pode entrar");
            }
        }
    }
}
