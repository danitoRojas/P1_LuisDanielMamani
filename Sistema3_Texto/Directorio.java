import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Directorio {
    private ArrayList<Documento> documentos = new ArrayList<Documento>();
    private String rutaDirectorio;

    public Directorio(String rutaDirectorio) {
        this.rutaDirectorio = rutaDirectorio;
    }

    public void agregarDocumento(Documento documento) {
        documentos.add(documento);
    }

    public void eliminarDocumento(Documento documento) {
        documentos.remove(documento);
        System.out.println("******************************" );
         System.out.println("Se elemino" +documento.getNombreArchivo());
           System.out.println("******************************" );
    }

    public Documento buscarDocumento(String nombreArchivo) {
        for (Documento documento : documentos) {
            if (documento.getNombreArchivo().equals(nombreArchivo)) {
                System.out.println("-----------------------------------------");
                    System.out.println("Doc:"+nombreArchivo);
                    System.out.println("------------------------------------------");
                    System.out.println(documento.getContenido());
                    System.out.println("----------------------------------------------");
               return documento;
            }
        }
        return null;
    }
    
     public void modificarDocumento(String nombreArchivo, String nuevoContenido) {
        Documento documento = buscarDocumento(nombreArchivo);
        if (documento == null) {
            System.out.println("No se encontró el documento " + nombreArchivo);
        } else {
            try {
                FileWriter escritor = new FileWriter(documento.getRutaArchivo());
                escritor.write(nuevoContenido);
                escritor.close();
                documento.setContenido(nuevoContenido);
                System.out.println("Se ha modificado el contenido del documento " + nombreArchivo);
            } catch (IOException e) {
                System.out.println("Ocurrió un error al modificar el documento.");
                e.printStackTrace();
            }
        }
    }
    // Métodos para imprimir la lista de documentos, mostrar un documento, etc.
}