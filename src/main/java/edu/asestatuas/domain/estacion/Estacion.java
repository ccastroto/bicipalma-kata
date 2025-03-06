package edu.asestatuas.domain.estacion;


import edu.asestatuas.domain.bicicleta.Bicicleta;
import edu.asestatuas.domain.tarjertausuario.TarjertaUsuario;

import java.util.Objects;

public class Estacion {

    private final int id;
    private final String direccion;
    private final Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes =  new Anclajes(numAnclajes);
    }

    private int getId() {
        return this.id;
    }
    private String getDireccion(){
        return this.direccion;
    }
    @Override
    public String toString(){
        return  "id:" + getId() + '\n' +
                "direccion:" + getDireccion() + '\n' +
                "numeroAnclajes:" + numAnclajes();
    }
    private Anclaje[] anclajes(){
        return this.anclajes.anclajes();
    }
    private int numAnclajes(){
        return this.anclajes.numAnclajes();
    }
    public void consultarEstacion() {
        System.out.println(this);
    }
    public int anclajesLibres(){
        int anclajesLibres = 0;
        for (Anclaje anclaje : anclajes()) {
            anclajesLibres++;
        }
        return anclajesLibres;
    }
    public void anclarBicicleta(Bicicleta bici) {
        if (Objects.isNull(bici)) {return;}

        int posicion = 0;
        int numeroAnclaje = posicion + 1;

        for (Anclaje anclaje: anclajes()) {
            if (!anclaje.isOcupado()) {
                    anclajes.ocuparAnclaje(posicion, bici);
                    mostrarAnclaje(bici, numeroAnclaje);
                    break;
            } else {
                posicion++;
            }
            numeroAnclaje++;
        }
    }
    private void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje) {
        System.out.println("bicicleta " + bicicleta.getId() + " ancla en el anclaje " + numeroAnclaje);
    }
    public boolean leerTajertaUsuario(TarjertaUsuario tarjertaUsuario) {
        return tarjertaUsuario.isActiva();
    }
    public void retirarBicicleta(TarjertaUsuario tarjertaUsuario) {
        if (leerTajertaUsuario(tarjertaUsuario)) {
            boolean biciRetirada = false;
            while (!biciRetirada) {
                int posicion = anclajes.seleccionarAnclaje();
                int numeroAnclaje = posicion + 1;

                if (anclajes.isAnclajeOcupado(posicion)) {
                    mostrarBicicleta(anclajes.getBiciAt(posicion), numeroAnclaje);
                    anclajes.liberarAnclaje(posicion);
                    biciRetirada = true;
                }
            }
        } else {
            System.out.println("Tajerta de usuario no encontrada:(");
        }
    }
    private void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclaje) {
        System.out.println("bicicleta retirada: " + bicicleta.getId() + " del anclaje: " + numeroAnclaje);
    }
    public void consultarAnclajes() {
        int posicion = 0;
        int numeroAnclaje = 0;

        for (Anclaje anclaje : anclajes()) {
            numeroAnclaje =  posicion + 1;
            if (anclaje.isOcupado()) {
                System.out.println("Anclaje " + numeroAnclaje + " " + anclaje.getBici().getId());
            } else {
                System.out.println("Anclaje " + numeroAnclaje + " " + " libre");
            }
            posicion++;
        }
    }
}
