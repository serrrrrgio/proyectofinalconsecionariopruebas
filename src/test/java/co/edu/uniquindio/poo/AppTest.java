/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }
    
    @Test
    public void testEmpleadoExistente() {
        LOG.info("Iniciando test empleado existente");
        Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "LL", PreguntaSeguridad.BEST_FRIEND, "Laura");
        Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);
        Empleado empleado1 = new Empleado("Joab", "Suarez", "hg@gmail.com", "1110456789", "3224567890", "joab123", "32541", PreguntaSeguridad.BEST_FRIEND, "Dastsn", 22);

        concesionario.agregarEmpleado(empleado1);
        assertTrue(concesionario.getEmpleados().contains(empleado1));
        LOG.info("Finalizando test empleado existente");
}
}