
public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;

		// quanto vale o segundo?

		System.out.println(segundo);

	}

}

// Estas vari�veis do tipo primitivo s�o trabalhadas com o valor do conte�do, 
// da vari�vel, ent�o, quando copiamos 5 para dentro de segundo, e depois 
// copiamos 10 para primeiro, a linha segundo = primeiro; n�o diz nada