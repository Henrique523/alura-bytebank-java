public class Cliente extends Autenticavel {
    private String nome;
    private String cpf;
    private String profissao;

    @Override
    public double getBonificacao() {
        return 0;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
