public class Documento {
    private String contenido;
    private String nombreArchivo;
    private String rutaArchivo;

    public Documento(String nombreArchivo, String rutaArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.rutaArchivo = rutaArchivo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }
    public void mostrarcont(){
         System.out.println(getContenido());
    }
    

    // Métodos para imprimir, mostrar, modificar y borrar el documento
}