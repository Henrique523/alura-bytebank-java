// Gerente eh um funcionário. Gerente herda da classe funcionário
public class Gerente extends Funcionario {
    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.1;
    }
}
