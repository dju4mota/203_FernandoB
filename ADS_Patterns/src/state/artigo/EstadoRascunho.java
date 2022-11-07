package state.artigo;

import java.time.LocalDateTime;

public class EstadoRascunho implements Estado{
    private Artigo artigo;

    public EstadoRascunho(Artigo artigo){
        this.artigo = artigo;
    }

    @Override
    public void publicar(){
        GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();

        if(seguranca.ehUsuarioAutor()){
            this.artigo.transitarEstadoPara(new EstadoRevisando(this.artigo));
            this.artigo.getLogHistorico().add("Artigo publicado em " + LocalDateTime.now());
        } else {
            throw new RuntimeException("Somente moderadores podem publicar artigos");
        }
    }

    @Override
    public void reprovar() {
        throw new RuntimeException("Artigo não pode ser reprovado");
    }
}
