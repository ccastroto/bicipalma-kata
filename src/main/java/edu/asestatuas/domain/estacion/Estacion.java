package edu.asestatuas.domain.estacion;



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
                "direccion:" + getDireccion() + '\n';
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
}
