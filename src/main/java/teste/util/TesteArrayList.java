package teste.util;

import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc  = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2  = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println(lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref);

        lista.remove(0);

        System.out.println(lista.size());

        Conta cc3  = new ContaCorrente(33, 33);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(44, 44);
        lista.add(cc4);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (Conta conta: lista) {
            System.out.println(conta);
        }
    }
}
