package teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteUnboxing {
    public static void main(String[] args) {
        int idade = 29;//Integer
        Integer idadeRef = Integer.valueOf(29); // Autoboxing

        int valor = idadeRef.intValue(); // Unboxing

        String s = args[0];

//        Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        // Autoboxing - quando o Java converte automaticamente um tipo primitivo para um Wrapper
        // Unboxing - quando o Java converte um Wrapper para um tipo primitivo
        numeros.add(idadeRef); // Lista de referências e nunca de tipos primitivos
    }
}
