
public class TestaPontoFlutuanteDouble {

	public static void main(String[] args) {
		double salario = 1250.70;
        	System.out.println(salario);
        	
    // n�o podemos colocar um valor com ponto flutuante dentro de uma vari�vel do tipo int
    //    int valor = 12.5;             //n�o compila. 
    //    int valor2 = 0.0;             //n�o compila.
    //    double teste = 125.50;        // compila
    //    int valor3 = teste;           //n�o compila.

    //int divisao = 5 / 2;
       // System.out.println(divisao); // sa�da ser� 2.
        
        double divisao = 5.0 / 2;
        System.out.println(divisao); // sa�da esperada: 2.5

	}

}
