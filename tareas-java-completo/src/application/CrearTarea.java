package application;

import domain.Tarea;
import ports.TareaRepository;

public class CrearTarea {
    private TareaRepository repo;
    private int contador = 1;

    public CrearTarea(TareaRepository repo) { this.repo = repo; }

    public void ejecutar(String titulo) {
        repo.guardar(new Tarea(contador++, titulo));
    }
}
