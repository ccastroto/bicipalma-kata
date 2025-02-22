package domain.estacion;

import edu.asestatuas.domain.estacion.Anclaje;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class AnclajeTest {

    private Anclaje anclaje;
    @Before
    public void setup_anclaje() {anclaje = new Anclaje();}

    @Test
    public void test_si_esta_ocupado(){
        assertFalse(anclaje.isOcupado());
        assertEquals(anclaje.isOcupado(),false);
    }
}
