public class CambioTexto {
    private final String textoAnterior;
    private final String textoNuevo;
    private final String fecha;
    private final String usuario;

    public CambioTexto(String textoAnterior, String textoNuevo, String fecha, String usuario) {
        this.textoAnterior = textoAnterior;
        this.textoNuevo = textoNuevo;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getTextoAnterior() {
        return textoAnterior;
    }

    public String getTextoNuevo() {
        return textoNuevo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Texto anterior: " + textoAnterior
                + " | Texto nuevo: " + textoNuevo
                + " | Fecha: " + fecha
                + " | Usuario: " + usuario;
    }
}