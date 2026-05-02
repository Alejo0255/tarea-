package domain;

public class Tarea {
    private int id;
    private String titulo;
    private boolean completada;

    public Tarea(int id, String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Título vacío");
        }
        this.id = id;
        this.titulo = titulo;
        this.completada = false;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public boolean isCompletada() { return completada; }

    public void completar() { this.completada = true; }

    public String toString() {
        return id + " - " + titulo + " - " + (completada ? "✔" : "Pendiente");
    }
}
