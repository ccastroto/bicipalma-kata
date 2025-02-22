package edu.asestatuas.domain.estacion;

import edu.asestatuas.domain.bicicleta.Bicicleta;

public class Anclaje {

    private boolean ocupado = false;
    private Bicicleta bicicleta;

    public Anclaje() {};

    public boolean isOcupado(){
        return this.ocupado;
    }
}
