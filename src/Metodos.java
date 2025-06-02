public class Metodos {
    public static double adicionar(double x, double y) {
        return x + y;
    }

    public static double subtrair(double x, double y) {
        return x - y;
    }

    public static double multiplicar(double x, double y) {
        return x * y;
    }

    public static double dividir(double x, double y) {
        return x / y;
    }

    public static double potencia(double x, double y) {
        return Math.pow(x, y); //Metodo que faz potenciação
    }

    public static double raizQuadrada(double x) {
        return Math.sqrt(x);
    }

    public String toString() {
        return "     CALCULADORA " +
                "\n| 7 | 8 | 9 | x |" +
                "\n| 4 | 5 | 6 | - |" +
                "\n| 1 | 2 | 3 | + |" +
                "\n|   | 0 |   | / |";
    }
}
