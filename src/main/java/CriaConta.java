public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(10, 10);
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(10, 10);
        segundaConta.deposita(50);

        System.out.println("Primeira conta tem: " + primeiraConta.getSaldo());
        System.out.println("Segunda conta tem: " + segundaConta.getSaldo());
    }
}
