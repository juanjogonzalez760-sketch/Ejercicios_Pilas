import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorCambios gestor = new GestorCambios();
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = leerEntero(scanner);

            switch (opcion) {
                case 1:
                    registrarCambio(gestor, scanner);
                    break;
                case 2:
                    deshacerCambio(gestor);
                    break;
                case 3:
                    consultarUltimoCambio(gestor);
                    break;
                case 4:
                    gestor.mostrarHistorial();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Esta opcion no existe.");
                    break;
            }
        }

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nSistema de deshacer de un editor de texto");
        System.out.println("1) Registrar cambio");
        System.out.println("2) Deshacer ultimo cambio");
        System.out.println("3) Consultar ultimo cambio");
        System.out.println("4) Mostrar historial");
        System.out.println("5) Salir");
        System.out.print("Seleccione una opcion: ");
    }

    private static void registrarCambio(GestorCambios gestor, Scanner scanner) {
        System.out.print("Texto anterior: ");
        String textoAnterior = scanner.nextLine();
        System.out.print("Texto nuevo: ");
        String textoNuevo = scanner.nextLine();
        System.out.print("Fecha: ");
        String fecha = scanner.nextLine();
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        gestor.registrarCambio(new CambioTexto(textoAnterior, textoNuevo, fecha, usuario));
        System.out.println("Cambio registrado correctamente.");
    }

    private static void deshacerCambio(GestorCambios gestor) {
        CambioTexto cambio = gestor.deshacerUltimoCambio();
        if (cambio == null) {
            System.out.println("No hay cambios para deshacer.");
            return;
        }
        System.out.println("Cambio deshecho: " + cambio);
    }

    private static void consultarUltimoCambio(GestorCambios gestor) {
        CambioTexto cambio = gestor.consultarUltimoCambio();
        if (cambio == null) {
            System.out.println("No hay cambios registrados.");
            return;
        }
        System.out.println("Ultimo cambio: " + cambio);
    }

    private static int leerEntero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un numero entero valido.");
            scanner.next();
        }
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }
}