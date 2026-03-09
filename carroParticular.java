public abstract class carroParticular extends veiculoAutomotor {

    public carroParticular(String modelo, double valorMercado, int anofabricacao) {
        super(modelo, valorMercado, anofabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double premioBase = getValorMercado() * 0.004;
        if (getAnofabricacao() < 2000) {
            premioBase += getValorMercado() * 0.05;
        }
        return premioBase;

    }

    private int getAnofabricacao() {
        return 0;
    }

    @Override
    public String descrever() {
        return "Carro Particular: " + getModelo()
                + ", Ano: " + getAnoFabricacao()
                + ", Valor de Mercado: R$ " + getValorMercado()
                + ", Prêmio do Seguro: R$ " + calcularValorPremio();

    }

}


