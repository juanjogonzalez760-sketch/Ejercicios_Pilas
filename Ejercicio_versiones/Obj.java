import java.util.UUID;

public class Obj {
    private UUID uuid;
    private String nombreArchivo;
    private String fecha;
    private String descripcion;

    public Obj(String nombreArchivo, String fecha, String descripcion) {
        this.uuid = UUID.randomUUID();
        this.nombreArchivo = nombreArchivo;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "UUID: " + uuid
                + " | Archivo: " + nombreArchivo
                + " | Fecha: " + fecha
                + " | Descripcion: " + descripcion;
    }

}
