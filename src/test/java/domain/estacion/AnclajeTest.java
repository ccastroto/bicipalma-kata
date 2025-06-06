package domain.estacion;

import edu.asestatuas.domain.bicicleta.Bicicleta;
import edu.asestatuas.domain.estacion.Anclaje;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class AnclajeTest {

    private Anclaje anclaje;
    private Bicicleta bici;
    @Before
    public void setup_anclaje() {
        anclaje = new Anclaje();
        bici = new Bicicleta(101);
    }

    @Test
    public void test_si_esta_ocupado(){
        assertFalse(anclaje.isOcupado());
        assertEquals(anclaje.isOcupado(),false);
    }
    @Test
    public void test_coge_bicicleta(){
        assertNotEquals(anclaje.getBici(), "");
    }
   @Test
   public void test_anclar_bicicleta(){
        // Si está libre
       assertFalse(anclaje.isOcupado());
       // Se ancla
       anclaje.anclarBici(bici);
       // Check
       assertTrue(anclaje.isOcupado());
       assertEquals(bici, anclaje.getBici());
   }
   @Test
    public void test_liberar_bicicleta(){
        // Anclarla
        anclaje.anclarBici(bici);
        // Verificarlo
        assertTrue(anclaje.isOcupado());
        assertNotNull(anclaje.getBici());
        // Liberarla
        anclaje.liberarBici();
        // Verificarla
        assertFalse(anclaje.isOcupado());
        assertEquals(null, anclaje.getBici());
   }
    @Test
    public void test_toString_anclaje(){
        // ARANGE
        String id = "101";
        // ACT
        String idBici = this.bici.toString();
        // ASSERT
        assertEquals(idBici, id);
    }
}
