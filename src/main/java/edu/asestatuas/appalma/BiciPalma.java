package edu.asestatuas.appalma;
import edu.asestatuas.domain.Estacion.Estacion;

public class BiciPalma {
    public static void main(String[] args) {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        System.out.println("\n **** caso TEST visualizar estado de la estacion **** \n");

        estacion.consultarEstacion();
    }
}