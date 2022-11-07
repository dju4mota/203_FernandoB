package state.artigo;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class ArtigoTeste {

    @Test
    void deveArtigoTransitarDeRascunhoParaAprovado(){
    GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();

    Artigo artigo = new Artigo();

    assertTrue(artigo.getEstado() instanceof EstadoRascunho);

//    1 -> Rascunho para revisando
    seguranca.setUsuarioCorrente("AUTOR");
    artigo.onPublicar();

    assertTrue(artigo.getEstado() instanceof EstadoRevisando);

//    2 -> Revisando para aprovado

    seguranca.setUsuarioCorrente("MODERADOR");
    artigo.onPublicar();

    assertTrue(artigo.getEstado() instanceof EstadoAprovado);

    }
}