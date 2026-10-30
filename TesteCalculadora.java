package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== EXECUÇÃO DOS TESTES UNITÁRIOS DA CALCULADORA ===\n");

        executarTeste(calc, 10, 5, "+", 15.0, "Soma Simples");
        executarTeste(calc, 20, 8, "-", 12.0, "Subtração Simples");
        executarTeste(calc, 4, 3, "*", 12.0, "Multiplicação Simples");
        executarTeste(calc, 10, 2, "/", 5.0, "Divisão Exata");
        executarTesteExcecao(calc, 10, 0, "/", "Divisão por Zero");
        executarTesteExcecao(calc, 5, 5, "%", "Operador Inválido");

        System.out.println("\n=== FINALIZAÇÃO DOS TESTES ===");
    }

    private static void executarTeste(Calculadora calc, int a, int b, String op, double esperado, String descricao) {
        try {
            double obtido = calc.calc(a, b, op);
            boolean passou = Math.abs(obtido - esperado) < 0.0001;
            
            System.out.println("Teste: " + descricao);
            System.out.println("  Entradas: a = " + a + ", b = " + b + ", op = '" + op + "'");
            System.out.println("  Resultado Esperado: " + esperado);
            System.out.println("  Resultado Obtido:   " + obtido);
            System.out.println("  Status: " + (passou ? "[APROVADO]" : "[FALHOU]") + "\n");
        } catch (Exception e) {
            System.out.println("Teste: " + descricao + " [FALHOU - Exceção Inesperada: " + e.getMessage() + "]\n");
        }
    }

    private static void executarTesteExcecao(Calculadora calc, int a, int b, String op, String descricao) {
        System.out.println("Teste: " + descricao);
        System.out.println("  Entradas: a = " + a + ", b = " + b + ", op = '" + op + "'");
        System.out.println("  Resultado Esperado: Exceção capturada e tratada");
        try {
            double obtido = calc.calc(a, b, op);
            System.out.println("  Resultado Obtido:   " + obtido + " (Deveria ter lançado exceção)");
            System.out.println("  Status: [FALHOU]\n");
        } catch (Exception e) {
            System.out.println("  Resultado Obtido:   " + e.getClass().getSimpleName() + " - " + e.getMessage());
            System.out.println("  Status: [APROVADO]\n");
        }
    }
}
