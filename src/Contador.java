import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

//        System.out.println("Digite o primeiro parâmetro");
//        int parametroUm = read.nextInt();
//        System.out.println("Digite o segundo parâmetro");
//        int parametroDois = read.nextInt();

        int parametroUm = 5; // parametro teste
        int parametroDois = 10; // parametro teste

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i < contagem; i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }

}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}