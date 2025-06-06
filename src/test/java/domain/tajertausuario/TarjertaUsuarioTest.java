package domain.tajertausuario;

import edu.asestatuas.domain.tarjertausuario.TarjertaUsuario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TarjertaUsuarioTest {

    private TarjertaUsuario tarjertausuario;
    @Before
    public void setup_tarjertausuario() {
        tarjertausuario = new TarjertaUsuario("juan", true);
    }
    @Test
    public void test_isActiva(){
        assertTrue(tarjertausuario.isActiva());
    }
    @Test
    public void test_setActiva(){
        tarjertausuario.setActiva(true);
        assertTrue(tarjertausuario.isActiva());
    }
    @Test
    public void tets_toString(){
        String id = "juan";
        String representarIdUsuario = tarjertausuario.toString();
        assertEquals(id, representarIdUsuario);
    }
}
