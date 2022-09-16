package teste;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(11, 111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(22, 112);
        cp.deposita(200);

        cc.transfere(10, cp);

        System.out.println("CC " + cc.getSaldo());
        System.out.println("CP " + cp.getSaldo());
    }
}
