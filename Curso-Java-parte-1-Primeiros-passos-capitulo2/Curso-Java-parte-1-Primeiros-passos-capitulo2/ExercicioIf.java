// 1. Crie a variável idade, do tipo inteiro e inicialize com o valor 20.. 
// 2. Escreva um código que teste se a variável idade é maior ou igual a 18, caso verdadeiro, exibiremos uma mensagem, caso falso (else), exibiremos uma outra mensagem. Nosso código deve ficar com essa cara:
// 3. Crie uma variável quantidadePessoas com o valor 3.
// 4. Adicione mais um if após o else no nosso código para testar se essa pessoa está acompanhada ou não, ficando assim:

public class ExercicioIf {
	public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;

        if (idade >= 18) {

            System.out.println("Você tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("voce nao tem 18, mas pode entrar, pois está acompanhado");
            } else {

                System.out.println("infelizmente voce nao pode entrar");
            }
        }
    }
}
