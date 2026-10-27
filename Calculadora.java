package calculadora;

/**
 * Projeto Calculadora
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal que seleciona a operação
 * desejada com base em um operador informado pelo usuário.</p>
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>,
 * sem efeitos colaterais, permitindo melhor legibilidade e facilitando testes unitários.</p>
 * 
 * @author Victor Hugo de Almeida Barbosa
 * @version 1.0
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da subtração de {@code a} por {@code b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o produto de {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números inteiros.
     * 
     * @param a numerador
     * @param b denominador (não pode ser zero)
     * @return o quociente da divisão de {@code a} por {@code b}
     * @throws IllegalArgumentException se o divisor for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Executa a operação matemática solicitada com base no operador informado.
     * <p>Operadores aceitos:</p>
     * <ul>
     *   <li>"+": Soma</li>
     *   <li>"-": Subtração</li>
     *   <li>"*": Multiplicação</li>
     *   <li>"/": Divisão</li>
     * </ul>
     * <p>Qualquer operador inválido resulta em exceção.</p>
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo da operação desejada
     * @return o resultado da operação correspondente ao operador informado
     * @throws IllegalArgumentException se o operador não for um símbolo válido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}