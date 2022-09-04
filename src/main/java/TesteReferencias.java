public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new ContaCorrente(10, 110);
        primeiraConta.deposita(300);

        System.out.println("saldo da primeira: " + primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;

        System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());

        segundaConta.deposita(100);

        System.out.println(primeiraConta.getSaldo());

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesma conta");
        }
    }
}
