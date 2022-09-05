public class Gerente extends Funcionario implements Autenticavel {
    private int senha;
    private AutenticacaoUtil util;

    public Gerente() {
        this.util = new AutenticacaoUtil();
    }

    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }

    public double getBonificacao() {
        return super.getSalario();
    }
}
