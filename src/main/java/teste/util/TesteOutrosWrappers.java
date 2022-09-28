package teste.util;

public class TesteOutrosWrappers {
    public static void main(String[] args) {
        Integer idadeRef = Integer.valueOf(29); // Autoboxing
        System.out.println(idadeRef.intValue()); // Unboxing

        Double dref = Double.valueOf(3.2); // Autoboxing
        System.out.println(dref.doubleValue()); // Unboxing

        Boolean bref = Boolean.TRUE;
        System.out.println(bref.booleanValue());

        // Classe mãe dos tipos numéricos
        Number number = Integer.valueOf(29);
    }
}
