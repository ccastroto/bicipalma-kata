package edu.asestatuas.domain.estacion;

import edu.asestatuas.domain.bicicleta.Bicicleta;

public class Anclaje {

    private boolean ocupado = false;
    private Bicicleta bici;

    public Anclaje() {};

    public boolean isOcupado(){
        return this.ocupado;
    }

    public Bicicleta getBici() {
        return this.bici;
    }
    public void anclarBici(Bicicleta bici){
        this.bici = bici;
        this.ocupado = true;
    }
    public void liberarBici(){
        this.bici = null;
    }
    public String toString(){
        return "ocupado: " + Boolean.toString(isOcupado());
    }
}
