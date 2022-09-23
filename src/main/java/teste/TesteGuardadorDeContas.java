package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {
    public static void main(String[] args) {
        GuardadorDeContas guardadorDeContas = new GuardadorDeContas();

        Conta cc  = new ContaCorrente(22, 11);

        guardadorDeContas.adiciona(cc);

        int tamanho = guardadorDeContas.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardadorDeContas.getReferencia(0);
        System.out.println(ref);
    }
}
