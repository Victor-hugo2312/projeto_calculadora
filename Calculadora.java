package calculadora;

/**
 * Projeto Calculadora
 * <p>Esta classe fornece operações matemáticas básicas como soma,
 * subtração, multiplicação e divisão.</p>
 *
 * @author Victor Hugo de Almeida Barbosa
 * @version 1.0
 */
public class Calculadora {

    public double somar(int a, int b) {
        return a + b;
    }

    public double subtrair(int a, int b) {
        return a - b;
    }

    public double multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return (double) a / b;
    }

    public double calc(int a, int b, String op) {
        if (op == null) {
            throw new IllegalArgumentException("O operador não pode ser nulo.");
        }
        switch (op) {
            case "+": return somar(a, b);
            case "-": return subtrair(a, b);
            case "*": return multiplicar(a, b);
            case "/": return dividir(a, b);
            default: throw new IllegalArgumentException("Operador inválido: " + op);
        }
    }
}
