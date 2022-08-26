public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta(10, 10);

        System.out.println(contaDaMarcela.getSaldo());

        contaDaMarcela.setTitular(new Cliente());
        contaDaMarcela.getTitular().setNome("Marcela");
        System.out.println(contaDaMarcela.getTitular().getNome());
    }
}
