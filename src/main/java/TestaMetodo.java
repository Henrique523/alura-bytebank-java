public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(200);

        System.out.println(conta.saldo);
        boolean conseguiuRetirar = conta.saca(50);
        System.out.println(conseguiuRetirar);
        System.out.println(conta.saldo);

        Conta novaConta = new Conta();
        novaConta.deposita(1000);

        novaConta.transfere(50, conta);

        System.out.println(conta.saldo);
    }
}
