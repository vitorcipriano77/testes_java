public class GestorDeImpostos {
    class GestorDeImpostos {
        private double valorTotalImpostos = 0.0;

        public void adicionar(Pessoa pessoa) {
            valorTotalImpostos += pessoa.calcularImpostos();
        }

        public double getValorTotalImpostos() {
            return valorTotalImpostos;
        }
    }
}
