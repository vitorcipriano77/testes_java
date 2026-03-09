public class imovelResidencial {

    public class ImovelResidencial implements BemSeguravel {
        private double valorMercado;
        private int areaConstruida;

        // Construtor
        public ImovelResidencial(double valorMercado, int areaConstruida) {
            this.valorMercado = valorMercado;
            this.areaConstruida = areaConstruida;
        }

        // Getters e Setters
        public double getValorMercado() {
            return valorMercado;
        }

        public void setValorMercado(double valorMercado) {
            this.valorMercado = valorMercado;
        }

        public int getAreaConstruida() {
            return areaConstruida;
        }

        public void setAreaConstruida(int areaConstruida) {
            this.areaConstruida = areaConstruida;
        }

        // Implementação da interface
        @Override
        public double calcularValorPremio() {
            double premioBase = getValorMercado() * 0.001;    // usa o getter
            double adicional = getAreaConstruida() * 0.03;    // usa o getter
            return premioBase + adicional;
        }

        @Override
        public String descrever() {
            return "Imóvel residencial com valor de mercado R$ "
                    + getValorMercado()
                    + ", área construída de "
                    + getAreaConstruida() + " m²"
                    + ", prêmio de seguro R$ "
                    + calcularValorPremio();
        }
    }

}
