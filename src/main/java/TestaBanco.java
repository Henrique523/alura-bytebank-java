public class TestaBanco {
    public static void main(String[] args) {
        Cliente guilherme = new Cliente();
        Conta novaConta = new Conta();

        guilherme.nome = "Guilherme Henrique";
        guilherme.cpf = "123.456.789-10";
        guilherme.profissao = "programador";

        novaConta.deposita(200);
        novaConta.titular = guilherme;

        System.out.println(novaConta.titular.nome);
    }
}
