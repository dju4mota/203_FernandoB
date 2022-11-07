package templatemethod.relatorio.intro;
import org.junit.jupiter.api.Test;

public class GeradorRelatorioVendasMensaisTest {

    @Test
    void deveGerarRelatorioVendasMensais(){
        GeradorRelatorioVendasMensais geradorRelatorioVendasMensais = new GeradorRelatorioVendasMensais();
        String relatorio = geradorRelatorioVendasMensais.criarPagina(2022, 10);
        System.out.println(relatorio);
    }

}
