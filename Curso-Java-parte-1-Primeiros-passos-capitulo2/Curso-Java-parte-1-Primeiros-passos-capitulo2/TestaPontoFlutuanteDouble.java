
public class TestaPontoFlutuanteDouble {

	public static void main(String[] args) {
		double salario = 1250.70;
        	System.out.println(salario);
        	
    // não podemos colocar um valor com ponto flutuante dentro de uma variável do tipo int
    //    int valor = 12.5;             //não compila. 
    //    int valor2 = 0.0;             //não compila.
    //    double teste = 125.50;        // compila
    //    int valor3 = teste;           //não compila.

    //int divisao = 5 / 2;
       // System.out.println(divisao); // saída será 2.
        
        double divisao = 5.0 / 2;
        System.out.println(divisao); // saída esperada: 2.5

	}

}
