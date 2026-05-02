package application;

import ports.TareaRepository;

public class ListarTareas {
    private TareaRepository repo;

    public ListarTareas(TareaRepository repo) { this.repo = repo; }

    public void ejecutar() {
        repo.listar().forEach(System.out::println);
    }
}
