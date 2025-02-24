package domain.estacion;

import edu.asestatuas.domain.estacion.Anclaje;
import edu.asestatuas.domain.estacion.Anclajes;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnclajesTest {

    private Anclajes anclajes;
    private static final int NUM_ANCLAJES = 6;

    @Before
    public void setup_anclajes(){
        anclajes = new Anclajes(NUM_ANCLAJES);
    }
    @Test
    public void testAnclajes(){
        // Check si objeto no es null
        assertNotNull(anclajes);
        // Check si array no es null
        assertNotNull(anclajes.anclajes());
        // Chack tamaño array esperado
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
}
