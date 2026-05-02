import application.*;
import infrastructure.InMemoryRepository;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InMemoryRepository repo = new InMemoryRepository();

        CrearTarea crear = new CrearTarea(repo);
        ListarTareas listar = new ListarTareas(repo);
        CompletarTarea completar = new CompletarTarea(repo);

        int op;
        do {
            System.out.println("\n1.Crear 2.Listar 3.Completar 4.Salir");
            op = sc.nextInt(); sc.nextLine();

            if (op == 1) {
                System.out.print("Título: ");
                crear.ejecutar(sc.nextLine());
            } else if (op == 2) listar.ejecutar();
            else if (op == 3) {
                System.out.print("ID: ");
                completar.ejecutar(sc.nextInt());
            }
        } while (op != 4);
    }
}
