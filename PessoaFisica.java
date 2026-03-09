 class PessoaFisica extends Pessoa {
        private static final double RECEITA_ANUAL_ISENCAO = 5000.0;
        private static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

        private double receitaAnual;

        public PessoaFisica(String nome, double receitaAnual) {
            super(nome);
            this.receitaAnual = receitaAnual;
        }

        public double getReceitaAnual() {
            return receitaAnual;
        }

       @Override
     public double calcularImpostos() {
            if (receitaAnual <= RECEITA_ANUAL_ISENCAO) {
                return 0.0;
            }
            return (receitaAnual - RECEITA_ANUAL_ISENCAO) * ALIQUOTA_IMPOSTO_RENDA;
       }
}
