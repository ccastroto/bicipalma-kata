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
    private Bicicleta biciDos;
    private static final int ID_ESTACION = 101;
    private static final String direccion = "Mallorca 33";
    private static final int NUM_ANCLAJES = 6;

    @Before
    public void setUp_estacion(){
        estacion = new Estacion(ID_ESTACION, direccion, NUM_ANCLAJES);
        anclajes = new Anclajes(NUM_ANCLAJES);
        bici = new Bicicleta(101);
        biciDos = new Bicicleta(102);
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
    @Test
    public void testToStringEstacion(){
        assertTrue(estacion.toString().contains(String.valueOf(estacion)));
    }
    @Test
    public void testAnclajesLibres(){
        // Check si los anclajes están libres
        assertEquals(NUM_ANCLAJES, estacion.anclajesLibres());
        // Simular si ocupa un anclaje y tiene que tener 1 menos
        assertNotEquals(NUM_ANCLAJES -1, estacion.anclajesLibres());
    }
    @Test
    public void testAnclarBicicleta(){
        assertEquals(NUM_ANCLAJES, estacion.anclajesLibres());
        estacion.anclarBicicleta(bici);
        assertNotEquals(NUM_ANCLAJES -1, estacion.anclajesLibres());
        estacion.anclarBicicleta(biciDos);
        assertNotEquals(NUM_ANCLAJES -1, estacion.anclajesLibres());
    }
}
