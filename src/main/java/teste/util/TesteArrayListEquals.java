package teste.util;

import modelo.Conta;
import modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1  = new ContaCorrente(22, 11);
        lista.add(cc1);

        Conta cc2  = new ContaCorrente(22, 22);
        lista.add(cc2);

        boolean exists = lista.contains(cc2);
        System.out.println("Já existe? " + exists);

        System.out.println(lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref);

//        lista.remove(0);

        System.out.println(lista.size());

        Conta cc3  = new ContaCorrente(33, 33);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(44, 44);
        lista.add(cc4);

        cc4.equals(cc3);

        for (Conta conta: lista) {
            if (conta == cc3) {
                System.out.println("Já tenho essa conta.");
            }
            System.out.println(conta);
        }
    }
}
