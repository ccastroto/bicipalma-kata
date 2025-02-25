package edu.asestatuas.domain.estacion;

import edu.asestatuas.domain.bicicleta.Bicicleta;

public class Anclajes {

    private final Anclaje[] anclajes;


    public Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }
    private void crearAnclajes() {
        for (int i = 0; i < this.anclajes.length; i++) {
                this.anclajes[i] = new Anclaje();
        }
    }
    public Anclaje[] anclajes() {
        return this.anclajes;
    }
    public int numAnclajes() {
        return this.anclajes.length;
    }
    public void ocuparAnclaje(int posicion, Bicicleta bicicleta){
        this.anclajes[posicion].anclarBici(bicicleta);
    }
    public boolean isAnclajeOcupado(int posicion){
        return this.anclajes[posicion].isOcupado();
    }
    public void liberarAnclaje(int posicion){
        this.anclajes[posicion].liberarBici();
    }
    public Bicicleta getBiciAt(int posicion){
        return this.anclajes[posicion].getBici();
    }
}
