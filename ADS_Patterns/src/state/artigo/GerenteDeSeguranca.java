package state.artigo;

public class GerenteDeSeguranca {
    private static GerenteDeSeguranca instance;
    private  String usuarioCorrente;

    private GerenteDeSeguranca(){
    }

    public static GerenteDeSeguranca getInstance(){
        if(instance == null){
         instance = new GerenteDeSeguranca();
        }
        return instance;
    }

    public String getUsuarioCorrente() {
        return usuarioCorrente;
    }

    public void setUsuarioCorrente(String usuarioCorrente) {
        this.usuarioCorrente = usuarioCorrente;
    }

    public boolean ehUsuarioModerador(){
        return "MODERADOR".equals(this.usuarioCorrente);
    }

    public boolean ehUsuarioAutor(){
        return "AUTOR".equals(this.usuarioCorrente);
    }

}
