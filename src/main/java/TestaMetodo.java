public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(4336, 550514);
        conta.deposita(200);

        System.out.println(conta.getSaldo());
        boolean conseguiuRetirar = conta.saca(50);
        System.out.println(conseguiuRetirar);
        System.out.println(conta.getSaldo());

        Conta novaConta = new ContaCorrente(4336, 550514);
        novaConta.deposita(1000);

        novaConta.transfere(50, conta);

        System.out.println(conta.getSaldo());
    }
}
