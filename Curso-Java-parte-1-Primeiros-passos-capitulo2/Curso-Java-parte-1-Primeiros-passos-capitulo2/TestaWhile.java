
public class TestaWhile {

	public static void main(String[] args) {
		
		    int contador = 0;
	        while(contador <= 10) {
	            System.out.println(contador);
	            contador = contador + 1; // Para o mesmo efeito, existe ainda o ++: contador++;
// Esta, na verdade, � a forma mais comum de se somar o valor de si mesmo mais uma vez, e usar ++contador; (o pr�-incremento) tamb�m traria o mesmo resultado.
	        }
	    }
	}

// O while � uma instru��o muito simples - lembrando que � preciso sempre inicializar 
//e declarar a vari�vel a ser utilizada, neste caso, em contador.