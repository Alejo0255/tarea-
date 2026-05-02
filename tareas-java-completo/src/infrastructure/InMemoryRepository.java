package infrastructure;

import domain.Tarea;
import ports.TareaRepository;
import java.util.*;

public class InMemoryRepository implements TareaRepository {
    private List<Tarea> tareas = new ArrayList<>();

    public void guardar(Tarea tarea) { tareas.add(tarea); }
    public List<Tarea> listar() { return tareas; }

    public Tarea buscarPorId(int id) {
        return tareas.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }
}
