
import java.util.ArrayList;

public class LaboratorioDeClase
{
     private int id;
    private String instructor;
    private Horario horario;
    private ArrayList<EquipoDeComputacion> equipos;
    private ArrayList<Estudiante> estudiantes;

    public LaboratorioDeClase(int id, String instructor, Horario horario, int cupo) {
        this.id = id;
        this.instructor = instructor;
        this.horario = horario;
        equipos = new ArrayList<EquipoDeComputacion>();
        for (int i = 1; i <= cupo; i++) {
            equipos.add(new EquipoDeComputacion(i));
        }
        estudiantes = new ArrayList<Estudiante>();
    }

    public int getId() {
        return id;
    }

    public String getInstructor() {
        return instructor;
    }

    public Horario getHorario() {
        return horario;
    }

    public ArrayList<EquipoDeComputacion> getEquipos() {
        return equipos;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public int getCupo() {
        return equipos.size();
    }

    public boolean hayCupoDisponible() {
        for (EquipoDeComputacion equipo : equipos) {
            if (equipo.estaDisponible()) {
                return true;
            }
        }
        
        //for (EquipoDeComputacion equipo : equipos) {
        System.out.println("No hoy cupos Disponibles");
        //}
        return false;
        
    }
    

    public boolean agregarEstudiante(Estudiante estudiante) {
        if (hayCupoDisponible()) {
            for (EquipoDeComputacion equipo : equipos) {
                if (equipo.estaDisponible()) {
                    equipo.setDisponible(false);
                    estudiantes.add(estudiante);
                    return true;
                }
            }
        }
        return false;
    }
    
    public void mostrarEquipo()
    {
          System.out.println("Numero de equipos");
           System.out.println("--------------------------");

        for(EquipoDeComputacion EquipoDeComputacion : equipos){
           
            System.out.println(EquipoDeComputacion.getNumeroDeEquipo());
             
        }
        System.out.println("--------------------------");
    }
    
    public void mostrarEstudiantes()
    {    
        System.out.println("-------Lista de Estudiantes-------");
         System.out.println("--------------------------");
        for(Estudiante Estudiante : estudiantes){
            System.out.println(Estudiante.getNombres());
        }
         System.out.println("--------------------------");
    }
}


  
