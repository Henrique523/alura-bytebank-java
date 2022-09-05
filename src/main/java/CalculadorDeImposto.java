public class CalculadorDeImposto {

    private double totalImposto;

    public void registra(Tributavel tributavel) {
        this.totalImposto += tributavel.getValorImposto();
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }
}
