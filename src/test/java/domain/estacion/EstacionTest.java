package domain.estacion;

import edu.asestatuas.domain.bicicleta.Bicicleta;
import edu.asestatuas.domain.tarjertausuario.TarjertaUsuario;
import edu.asestatuas.domain.estacion.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EstacionTest {

    private  Estacion estacion;
    private Anclajes anclajes;
    private Anclaje anclaje;
    private  TarjertaUsuario tarjertaUsuario;
    private  Bicicleta bici;
    private static final int ID_ESTACION = 101;
    private static final String direccion = "Mallorca 33";
    private static final int NUM_ANCLAJES = 6;

    @Before
    public void setUp_estacion(){
        estacion = new Estacion(ID_ESTACION, direccion, NUM_ANCLAJES);
        anclajes = new Anclajes(NUM_ANCLAJES);
        bici = new Bicicleta(101);
    }
    @Test
    public void testEstacion(){
        // Check Anclajes
        assertEquals(NUM_ANCLAJES, anclajes.numAnclajes());
        // Check id Bci
        assertEquals(ID_ESTACION, bici.getId());
        // Check su direccion
        assertEquals(direccion, "Mallorca 33");
    }
}
