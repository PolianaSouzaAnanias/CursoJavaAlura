
public class TestaWhile {

	public static void main(String[] args) {
		
		    int contador = 0;
	        while(contador <= 10) {
	            System.out.println(contador);
	            contador = contador + 1; // Para o mesmo efeito, existe ainda o ++: contador++;
// Esta, na verdade, é a forma mais comum de se somar o valor de si mesmo mais uma vez, e usar ++contador; (o pré-incremento) também traria o mesmo resultado.
	        }
	    }
	}

// O while é uma instrução muito simples - lembrando que é preciso sempre inicializar 
//e declarar a variável a ser utilizada, neste caso, em contador.