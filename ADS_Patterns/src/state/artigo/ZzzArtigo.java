package state.artigo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ZzzArtigo {

    private String estado;
    private List<String> logHistorico = new ArrayList<>();


    public ZzzArtigo(){
        this.estado =  Estados.AUTOR.name();
    }

    public void publicar(){
        GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
        if(Estados.RASCUNHO.name().equals(this.estado)){
            if(seguranca.ehUsuarioModerador()){
                this.estado = Estados.REVISANDO.name();
                this.logHistorico.add("Artigo em revisão | " + LocalDateTime.now());
                return;
            } else {
                throw new RuntimeException("Somente moderadores podem publicar artigos");
            }
        }
        if (Estados.REVISANDO.name().equals(this.estado)){
            if(seguranca.ehUsuarioModerador()){
                this.estado = Estados.APROVADO.name();
                this.logHistorico.add("Artigo aprovado | " + LocalDateTime.now());
                return;
            } else {
                throw new RuntimeException("Somente moderadores podem publicar artigos");
            }
        }
        if (Estados.APROVADO.name().equals(this.estado)) {
            return;
        }
    }

    public void reprovar(){
        GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();

        if(Estados.REVISANDO.name().equals(this.estado)){
            if(seguranca.ehUsuarioModerador()){
                this.estado = Estados.RASCUNHO.name();
                this.logHistorico.add("Transitado para Rascunho | " + LocalDateTime.now());
                return;
            } else {
                throw new RuntimeException("Somente moderadores podem publicar artigos");
            }
        }
    }

    public String getEstado() {
        return estado;
    }

    public List<String> getLogHistorico() {
        return logHistorico;
    }


}
