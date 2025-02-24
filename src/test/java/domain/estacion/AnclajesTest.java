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
        assertNotNull(anclajes);
        assertNotNull(anclajes.anclajes());
        assertEquals(NUM_ANCLAJES, anclajes.anclajes().length, + NUM_ANCLAJES);
        for (Anclaje anclaje : anclajes.anclajes()){
            assertNotNull(anclaje);
        }
    }
}
