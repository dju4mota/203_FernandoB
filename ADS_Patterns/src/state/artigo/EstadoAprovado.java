package state.artigo;

public class EstadoAprovado implements Estado{
    private Artigo artigo;

    public EstadoAprovado(Artigo artigo){
        this.artigo = artigo;
    }

    @Override
    public void publicar( ){
       throw new RuntimeException("Artigo já está publicado");
    }

    @Override
    public void reprovar(){
        throw new RuntimeException("Artigo não pode ser reprovado");
    }

}
