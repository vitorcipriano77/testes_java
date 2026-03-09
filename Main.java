import com.cipriano.contaspagar.modelo.Holerite;
import com.cipriano.contaspagar.servico.ServicoContaPagar;
import com.cipriano.pagamento.Beneficiario;
import com.cipriano.pagamento.DocumentoPagavel;

    public class Main {

    public static void main(String[] args) {
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        Beneficiario funcionario = new Beneficiario("Joao da Silva","19777777777","191077")
        Holerite documento = new Holerite(funcionario, 100,168);

        servicoContaPagar.pagar(documento);
    }
}
