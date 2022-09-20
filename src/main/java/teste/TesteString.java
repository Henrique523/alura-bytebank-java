package teste;

public class TesteString {
    public static void main(String[] args) {
        String conta = "conta"; // Object literal
        // String outra = new String("Outra"); // Má prática

        // String outra = conta.replace('a', 'A');
        String outra = conta.toUpperCase();

        System.out.println(outra);
    }
}
