package edu.asestatuas.appalma;
import edu.asestatuas.domain.estacion.Estacion;

public class BiciPalma {
    public static void main(String[] args) {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        System.out.println("\n **** caso TEST visualizar estado de la estacion **** \n");

        estacion.consultarEstacion();

        System.out.println("\n **** caso TEST visualizar anclajes libres **** \n");

        System.out.println("anclajesLibres: " + estacion.anclajesLibres());

        estacion.consultarAnclajes();
    }
}