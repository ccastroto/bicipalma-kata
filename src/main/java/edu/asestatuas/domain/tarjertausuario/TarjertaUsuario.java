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

}
