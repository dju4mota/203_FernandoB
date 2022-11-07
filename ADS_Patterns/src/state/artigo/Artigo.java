package state.artigo;

import java.util.ArrayList;
import java.util.List;

public class Artigo {

    private Estado estado;
    private List<String> logHistorico = new ArrayList<>();

    public Artigo(){
        this.estado = new EstadoRascunho(this);
    }

    public void onPublicar(){
        this.estado.publicar();
    }

    public void onReprovar(){
        this.estado.reprovar();
    }

    protected void transitarEstadoPara(Estado novoEstado){
        this.estado = novoEstado;
    }

    public Estado getEstado() {
        return estado;
    }

    public List<String> getLogHistorico() {
        return logHistorico;
    }
}
