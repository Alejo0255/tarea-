package application;

import domain.Tarea;
import ports.TareaRepository;

public class CompletarTarea {
    private TareaRepository repo;

    public CompletarTarea(TareaRepository repo) { this.repo = repo; }

    public void ejecutar(int id) {
        Tarea t = repo.buscarPorId(id);
        if (t != null) t.completar();
    }
}
