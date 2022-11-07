package state.artigo;

import java.time.LocalDateTime;

public class EstadoRevisando implements Estado {
    private Artigo artigo;

    public EstadoRevisando(Artigo artigo) {
        this.artigo = artigo;
    }


    @Override
    public void publicar() {
        GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();

        if (seguranca.ehUsuarioModerador()) {
            this.artigo.transitarEstadoPara(new EstadoAprovado(this.artigo));
            this.artigo.getLogHistorico().add("Artigo publicado em " + LocalDateTime.now());
        } else {
            throw new RuntimeException("Somente moderadores podem publicar artigos");
        }

    }

    @Override
    public void reprovar() {
        GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();

        if (seguranca.ehUsuarioModerador()) {
            this.artigo.transitarEstadoPara(new EstadoRascunho(this.artigo));
            this.artigo.getLogHistorico().add("Transitado para Rascunho | " + LocalDateTime.now());
        } else {
            throw new RuntimeException("Somente moderadores podem publicar artigos");
        }

    }
}
