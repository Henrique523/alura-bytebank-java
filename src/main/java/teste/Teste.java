package teste;

import modelo.ContaCorrente;

public class Teste {
    public static void main(String[] args) {
        int[] idades = new int[5];

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i*i;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(111, 111);

        contas[0] = cc1;
    }
}
