// 1) Crie uma classe e estruture seu m�todo main, no curso demos o nome de "TestaEscopo".
// 2) Quebre a sua declara��o da vari�vel booleana, usando um if.
// 3) Modifique seu c�digo para que ele compile (Repare que o c�digo deixa de compilar, j� que a vari�vel � criada dentro do if, quando chegamos ao final do if, ela deixa de existir)
// 

public class EscopoVariavel {
	public class TestaEscopo {

        public static void main(String[] args){
            System.out.println("testando condicionais");

            int idade = 20;
            int quantidadePessoas = 3;    
            boolean acompanhado;

            if (quantidadePessoas >= 2) {
                acompanhado = true;
            }else {
                acompanhado = false;
            }

            if (idade >=18 || acompanhado){

                System.out.println("Seja bem vindo"); 
            } else {
                System.out.println("infelizmente voce nao pode entrar");
            }
        }
	}
}
