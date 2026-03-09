public class caminhao extends veiculoAutomotor {
    private int quantidadeEixos;

    public caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }
 
    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double premioBase = getValorMercado() * 0.002; // 0,2% do valor de mercado
        double adicional = getQuantidadeEixos() * 50;  // R$50 por eixo
        return premioBase + adicional;
    }

    @Override
    public String descrever() {
        return "Caminhão: " + getModelo()
                + ", Ano: " + getAnoFabricacao()
                + ", Valor de Mercado: R$ " + getValorMercado()
                + ", Eixos: " + getQuantidadeEixos()
                + ", Prêmio do Seguro: R$ " + calcularValorPremio();
    }

}
