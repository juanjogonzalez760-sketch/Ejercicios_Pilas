import java.util.Stack;

public class GestorCambios {
    private final Stack<CambioTexto> historial = new Stack<>();

    public void registrarCambio(CambioTexto cambio) {
        historial.push(cambio);
    }

    public CambioTexto deshacerUltimoCambio() {
        if (historial.isEmpty()) {
            return null;
        }
        return historial.pop();
    }

    public CambioTexto consultarUltimoCambio() {
        if (historial.isEmpty()) {
            return null;
        }
        return historial.peek();
    }

    public boolean estaVacio() {
        return historial.isEmpty();
    }

    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No hay cambios registrados.");
            return;
        }

        System.out.println("Historial de cambios (del mas antiguo al mas reciente):");
        for (CambioTexto cambio : historial) {
            System.out.println(cambio);
        }
    }
}