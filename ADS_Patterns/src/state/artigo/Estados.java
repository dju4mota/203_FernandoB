package state.artigo;

public enum Estados {
    MODERADOR("MODERADOR"),
    AUTOR("AUTOR"),
    REVISANDO("REVISANDO"),
    RASCUNHO("RASCUNHO"),
    APROVADO("APROVADO"),
    ;

    Estados(String autor) {
    }
}
