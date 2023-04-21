import java.util.ArrayList;
public class SistemaBiblioteca
{
private ArrayList<Libros> listLibros;
private ArrayList<Mapas> listMapas;
private ArrayList<Cartillas> listCartillas;
private ArrayList<Revistas> listRevistas;
private ArrayList<Enciclopedias> listEnciclopedias;
public SistemaBiblioteca()
 {
 listLibros = new ArrayList<Libros>();
 listMapas = new ArrayList<Mapas>();
 listCartillas = new ArrayList<Cartillas>();
 listRevistas = new ArrayList<Revistas>();
 listEnciclopedias = new ArrayList<Enciclopedias>();
 }
 //LIBROS
 public void addlibross(Libros libros)
 {
   listLibros.add(libros); 
 }
 //MAPAS
 public void addmapass(Mapas mapas)
 {
   listMapas.add(mapas); 
 }
 // CARTILLAS
  public void addcartillas(Cartillas cartillas)
 {
   listCartillas.add(cartillas); 
 }
 //REVISTAS
  public void addrevistas(Revistas revistas)
 {
   listRevistas.add(revistas); 
 }
 //ENCICLOPEDIAS
  public void addenciclopedias(Enciclopedias enciclopedias)
 {
   listEnciclopedias.add(enciclopedias); 
 }
 //LISTAR LIBROS
 public void listarLibros()
 {
  if (listLibros.size()>0)  
  {
   for (Libros item : listLibros){
    item.mostrarLibros();
   }
  }
   else {
    System.out.println("----------------------------------");
    System.out.println("No hay nigun libro");
    System.out.println("----------------------------------");
    } 
 }
 //LISTAR MAPAS
  public void listarMapas()
 {
  if (listMapas.size()>0)  
  {
   for (Mapas item : listMapas){
    item.mostrarMapas();
   }
  }
   else {
    System.out.println("----------------------------------");
    System.out.println("No hay mapas");
    System.out.println("----------------------------------");
    } 
 }
 //LISTAR CARTILLAS
 public void listarCartillas()
 {
  if (listCartillas.size()>0)  
  {
   for (Cartillas item : listCartillas){
    item.mostrarCartillas();
   }
  }
   else {
    System.out.println("----------------------------------");
    System.out.println("No hay Cartilla");
    System.out.println("----------------------------------");
    } 
 }
 //LISTAR REVISTAS
  public void listarRevistas()
 {
  if (listRevistas.size()>0)  
  {
   for (Revistas item : listRevistas){
    item.mostrarRevistas();
   }
  }
   else {
    System.out.println("----------------------------------");
    System.out.println("No hay revistas");
    System.out.println("----------------------------------");
    } 
 }
 //LISTAR REVISTAS
  public void listarEnciclopedias()
 {
  if (listEnciclopedias.size()>0)  
  {
   for (Enciclopedias item : listEnciclopedias){
    item.mostrarEnciclopedias();
   }
  }
   else {
    System.out.println("----------------------------------");
    System.out.println("No hay Enciclopedias");
    System.out.println("----------------------------------");
    } 
 }
}






