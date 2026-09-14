import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Obj> pila = new Stack<>();
        Metodos m = new Metodos();
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSistema de versiones de archivos");
            System.out.println("1) Crear nueva version");
            System.out.println("2) Volver a la version anterior");
            System.out.println("3) Consultar version actual");
            System.out.println("4) Mostrar todas las versiones");
            System.out.println("5) Salir");
            System.out.print("Seleccione una opcion: ");
            int opt = m.ValidarEntero(sc);
            switch (opt) {
                case 1:
                    m.CrearVersion(pila, sc);
                    break;
                case 2:
                    m.VolverVersionAnterior(pila);
                    break;
                case 3:
                    m.ConsultarVersionActual(pila);
                    break;
                case 4:
                    m.MostrarVersiones(pila);
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;

                default:
                    System.out.println("esta opcion no existe");
                    break;
            }
        }
    }
}
