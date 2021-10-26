
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

// quando tentamos colocar um valor inteiro em uma vari�vel do tipo double o Java n�o mostra erro. Quando tentamos, por�m, colocar um double numa vari�vel do tipo inteiro temos um erro de compila��o.
// Esta propriedade se d� porque o Java faz convers�o impl�cita de um tipo menor para os tipos "maiores". De inteiro para double, por exemplo.
// O contr�rio n�o � verdade por que existe perda de dados quando � feita a convers�o. Acarretando em um "type mismatch" mostrando que esta instru��o � de tipos incompat�veis.
// Para fazer uma convers�o onde pode haver perda de informa��es � necess�rio fazer um type casting. Veja a instru��o abaixo.
// int idade = (int) 30.0;
// No caso acima, est� expl�cito que ser� feito o cast de double para inteiro. Veja como funciona o cast impl�cito e expl�cito na tabela abaixo.