package edu.asestatuas.appalma;

import edu.asestatuas.domain.estacion.Estacion;
import edu.asestatuas.domain.bicicleta.Bicicleta;
import edu.asestatuas.domain.tarjertausuario.TarjertaUsuario;

public class BiciPalma {
    public static void main(String[] args) {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        System.out.println("\n **** caso TEST visualizar estado de la estacion **** \n");

        estacion.consultarEstacion();

        System.out.println("\n **** caso TEST visualizar anclajes libres **** \n");

        System.out.println("anclajesLibres: " + estacion.anclajesLibres());

        estacion.consultarAnclajes();

        System.out.println("\n **** caso TEST anclar bicicleta(s) **** \n");

        int[] bicicletas = { 291, 292, 293, 294 };

        Bicicleta bicicleta = null;
        for (int id : bicicletas) {
            bicicleta = new Bicicleta(id);
            estacion.anclarBicicleta(bicicleta);
        }

        System.out.println("anclajes libres tras generar " + bicicletas.length
                + " bicis: " + estacion.anclajesLibres());

        System.out.println("\n **** caso TEST consultar bicicletas ancladas **** \n");
        estacion.consultarAnclajes();


        System.out.println("\n **** caso TEST retirar bicicleta **** \n");

        TarjertaUsuario tarjertaUsuario = new TarjertaUsuario("000456789", true);

        System.out.println("¿tarjeta de usuario activada? (true/false): "
                + estacion.leerTajertaUsuario(tarjertaUsuario));

        estacion.retirarBicicleta(tarjertaUsuario);

        estacion.consultarAnclajes();

        System.out.println("anclajesLibres: " + estacion.anclajesLibres());


        tarjertaUsuario.setActiva(false);

        System.out.println("¿tarjeta de usuario activada? (true/false): "
                + estacion.leerTajertaUsuario(tarjertaUsuario));

        estacion.retirarBicicleta(tarjertaUsuario);

        estacion.consultarAnclajes();
    }
}