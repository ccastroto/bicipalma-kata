package edu.asestatuas.domain.tarjertausuario;

public class TarjertaUsuario {

    private final String id;
    private boolean activo;

    public TarjertaUsuario(String id, boolean activo) {
        this.id = id;
        this.activo = activo;
    }

    public boolean isActiva() {
        return this.activo;
    }
    public void setActiva(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return this.id;
    }
}
