package co.com.swiii.registrotemperatura.model;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmpleadoTest { //extends TestCase

    @Test
    public void crearEmpleadoSinId() throws Exception {
        try {
            Empleado empleado = new Empleado.EmpleadoBuilder().build();
        } catch (Exception exception) {
            assertEquals(Empleado.ID_REQUERIDO, exception.getMessage());
        }
    }

    @Test
    public void validarFechaNula() throws Exception {
        try {
            Empleado empleado = new Empleado.EmpleadoBuilder().setFechaNacimiento(new Date()).build();
        } catch (Exception exception) {
            assertEquals(Empleado.FECHA_NACIMIENTO_REQUERIDA, exception.getMessage());
        }
    }


}
