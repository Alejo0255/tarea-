package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TareaTest {

    @Test
    void crearTarea() {
        Tarea t = new Tarea(1, "Estudiar");
        assertEquals("Estudiar", t.getTitulo());
    }

    @Test
    void tituloVacio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Tarea(1, "");
        });
    }

    @Test
    void completar() {
        Tarea t = new Tarea(1, "Test");
        t.completar();
        assertTrue(t.isCompletada());
    }
}
