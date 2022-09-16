package teste;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente guilherme = new Cliente();
        Conta novaConta = new ContaCorrente(10 ,10);

        guilherme.setNome("Guilherme Henrique");
        guilherme.setCpf("123.456.789-10");
        guilherme.setProfissao("programador");

        novaConta.deposita(200);
        novaConta.setTitular(guilherme);

        System.out.println(novaConta.getTitular().getNome());
    }
}
