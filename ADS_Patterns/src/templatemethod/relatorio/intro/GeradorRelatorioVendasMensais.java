package templatemethod.relatorio.intro;

import java.util.List;

public class GeradorRelatorioVendasMensais {

    public String getCabecalho() {
        return "Empresa \n ------------- ";
    }

    public List<String> getConteudo(Integer ano, Integer mes) {
        List<String> vendasMensal = ServicoDeRelatorio.getInstance().getVendasMensal(ano, mes);
        return  vendasMensal;
    }

    public String getRodape() {
        return "------------- \n *Propriedade particular ";
    }


    public String criarPagina(Integer ano, Integer mes) {
        String cabecalho = getCabecalho();
        List<String> conteudo = getConteudo(ano, mes);
        String rodape = getRodape();

        StringBuffer pagina = new StringBuffer();
        pagina.append(cabecalho);
        for (String linha : conteudo) {
            pagina.append(linha);
            pagina.append("\n" + linha);
        }
        pagina.append(rodape);
        return pagina.toString();
    }

}
