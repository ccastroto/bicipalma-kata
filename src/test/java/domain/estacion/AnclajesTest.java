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
}
