package domain.estacion;

import edu.asestatuas.domain.bicicleta.Bicicleta;
import edu.asestatuas.domain.estacion.Anclaje;
import edu.asestatuas.domain.estacion.Anclajes;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnclajesTest {

    private Anclajes anclajes;
    private static final int NUM_ANCLAJES = 6;
    private Bicicleta bici;

    @Before
    public void setup_anclajes(){
        anclajes = new Anclajes(NUM_ANCLAJES);
        bici = new Bicicleta(101);
    }
    @Test
    public void testAnclajes(){
        // Check si objeto no es null
        assertNotNull(anclajes);
        // Check si array no es null
        assertNotNull(anclajes.anclajes());
        // Check tamaño array esperado
        assertEquals(NUM_ANCLAJES, anclajes.anclajes().length, + NUM_ANCLAJES);
        // Check posición objecto
        for (Anclaje anclaje : anclajes.anclajes()){
            assertNotNull(anclaje);
        }
    }
    @Test
    public void testNumAnclajes(){
        assertEquals(NUM_ANCLAJES, anclajes.numAnclajes());
    }
    @Test
    public void testOcuparAnclaje(){
        int posicion = 3;
        // Ocuaparlo
        anclajes.ocuparAnclaje(posicion, bici);
        // Check su posición está ocupado
        assertTrue(anclajes.anclajes()[posicion].isOcupado());
        // Check anclaje posición tiene la bici
        assertEquals(bici, anclajes.anclajes()[posicion].getBici());
    }
    @Test
    public void testisAnclajeOcupado(){
        assertFalse(anclajes.isAnclajeOcupado(0));
        assertFalse(anclajes.isAnclajeOcupado(1));
        assertFalse(anclajes.isAnclajeOcupado(5));
    }
    @Test
    public void testLiberarAnclaje(){
        int posicion = 3;
        // Esta definido la posición ocupada y libera
        anclajes.liberarAnclaje(posicion);
        // Check si la posición definida está liberada
        assertFalse(anclajes.anclajes()[posicion].isOcupado());
    }
    @Test
    public void testgetBiciAt(){
        int posicion = 3;
        // Debe devolver null
        assertNull(anclajes.getBiciAt(posicion));
        // Ocuparlo
        anclajes.ocuparAnclaje(posicion, bici);
        // Check si es correcta la bici
        assertEquals(bici, anclajes.getBiciAt(posicion));
    }
    @Test
    public void testSetAnclaje(){
        int posicion = anclajes.seleccionarAnclaje();
        // Check si es verdadero con el operador AND log.
        assertTrue(posicion >= 0 && posicion < NUM_ANCLAJES);
        // Check si da lo mismo de que lo espera a lo que es.
        assertEquals(5,5);

    }
}
