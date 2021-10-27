
public class ExercícioCaracteres {
	public static void main(String[] args){

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;                    // Compila!
        System.out.println(valor);

        valor = (char) (valor + 1);         // Compila!
        System.out.println(valor);

        String palavra = "alura cursos online de tecnologia";
        System.out.println(palavra);

        palavra = palavra + 2020;
        System.out.println(palavra); // 
    }
}

// O número 2020 aparece no final da frase, isso acontece porque o Java converte automaticamente o número para String