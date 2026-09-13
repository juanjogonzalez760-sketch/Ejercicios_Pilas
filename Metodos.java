import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    public void CrearVersion(Stack<Obj> pila, Scanner sc) {
        System.out.print("Nombre del archivo: ");
        String nombreArchivo = sc.nextLine();
        System.out.print("Fecha: ");
        String fecha = sc.nextLine();
        System.out.print("Descripcion: ");
        String descripcion = sc.nextLine();

        Obj version = new Obj(nombreArchivo, fecha, descripcion);
        pila.push(version);
        System.out.println("Version guardada correctamente con UUID: " + version.getUuid());
    }

    public void VolverVersionAnterior(Stack<Obj> pila) {
        if (pila.isEmpty()) {
            System.out.println("No hay versiones disponibles.");
            return;
        }

        Obj versionEliminada = pila.pop();
        System.out.println("Se retiro la version con UUID: " + versionEliminada.getUuid());
    }

    public void ConsultarVersionActual(Stack<Obj> pila) {
        if (pila.isEmpty()) {
            System.out.println("No hay una version actual.");
            return;
        }

        System.out.println("Version actual: " + pila.peek());
    }

    public void MostrarVersiones(Stack<Obj> pila) {
        if (pila.isEmpty()) {
            System.out.println("No hay versiones disponibles.");
            return;
        }

        System.out.println("Versiones disponibles (de la mas antigua a la mas reciente):");
        for (Obj version : pila) {
            System.out.println(version);
        }

    }

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Ingrese un numero entero valido.");
            sc.next();
        }
        int valor = sc.nextInt();
        sc.nextLine();
        return valor;
    }

}
