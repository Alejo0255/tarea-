package ports;

import domain.Tarea;
import java.util.List;

public interface TareaRepository {
    void guardar(Tarea tarea);
    List<Tarea> listar();
    Tarea buscarPorId(int id);
}
