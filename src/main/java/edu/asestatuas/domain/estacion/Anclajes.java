package edu.asestatuas.domain.estacion;

class Anclajes {

    private final Anclaje[] anclajes;

    Anclajes (int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }
    private void crearAnclajes() {
        for (int i = 0; i < this.anclajes.length; i++) {
                this.anclajes[i] = new Anclaje();
        }
    }
    Anclaje[] anclajes() {
        return this.anclajes;
    }
    int numAnclajes() {
        return this.anclajes.length;
    }
}
