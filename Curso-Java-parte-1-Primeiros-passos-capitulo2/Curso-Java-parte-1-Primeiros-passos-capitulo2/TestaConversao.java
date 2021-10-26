
public class TestaConversao {
		public static void main(String[] args){

        float pontoFlutuante = 3.14f;

        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }
}

// quando tentamos colocar um valor inteiro em uma variável do tipo double o Java não mostra erro. Quando tentamos, porém, colocar um double numa variável do tipo inteiro temos um erro de compilação.
// Esta propriedade se dá porque o Java faz conversão implícita de um tipo menor para os tipos "maiores". De inteiro para double, por exemplo.
// O contrário não é verdade por que existe perda de dados quando é feita a conversão. Acarretando em um "type mismatch" mostrando que esta instrução é de tipos incompatíveis.
// Para fazer uma conversão onde pode haver perda de informações é necessário fazer um type casting. Veja a instrução abaixo.
// int idade = (int) 30.0;
// No caso acima, está explícito que será feito o cast de double para inteiro. Veja como funciona o cast implícito e explícito na tabela abaixo.