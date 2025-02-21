package domain.bicicleta;

import edu.asestatuas.domain.bicicleta.Bicicleta;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BicicletaTest {

    private Bicicleta bicicleta = null;
    @Before
    public void setup_bicicleta() {
        bicicleta = new Bicicleta(101);
    }

    @Test
    public void test_constructor_bicicleta() {
        // ARRANGE
        int idExpected = 101;
        // ACT
        int id = bicicleta.getId();
        // ASSERT
        assertEquals(idExpected, id);
    }
    public void test_toString_bicicleta() {
        // ARRANGE
        String id = "101";
        // ACT
        String representarIdBici = bicicleta.toString();
        // ASSERT
        assertEquals(id, representarIdBici);
    }
}
