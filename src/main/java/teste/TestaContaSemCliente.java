package teste;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new ContaCorrente(10, 10);

        System.out.println(contaDaMarcela.getSaldo());

        contaDaMarcela.setTitular(new Cliente());
        contaDaMarcela.getTitular().setNome("Marcela");
        System.out.println(contaDaMarcela.getTitular().getNome());
    }
}
