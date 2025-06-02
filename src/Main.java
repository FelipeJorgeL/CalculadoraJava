import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objetos
        Scanner input = new Scanner(System.in);
        Metodos metodos = new Metodos();
        //Variáveis
        int x, y, operacao;
        String resposta;

        do {
            System.out.println(metodos);
            System.out.println("Digite o primeiro número: ");
            x = input.nextInt();
            System.out.println("Digite o segundo número: ");
            y = input.nextInt();
            System.out.println("1. Adição | 2. Subtração \n3. Multiplicação | 4. Divisão");
            operacao = input.nextInt();
            if (operacao == 1) {
                System.out.println(x + " + " + y + " = " + metodos.adicionar(x, y));
            } else if (operacao == 2) {
                System.out.println(x + " - " + y + " = " + metodos.subtrair(x, y));
            } else if (operacao == 3) {
                System.out.println(x + " * " + y + " = " + metodos.multiplicar(x, y));
            } else if (operacao == 4) {
                System.out.println(x + " / " + y + " = " + metodos.dividir(x, y));
            } else {
                System.out.println("Digite apenas os sinais de operações matemáticas");
            }
            System.out.println("Deseja continuar? (S/N)");
            resposta = input.nextLine();

        } while (resposta != "N");


    }
}