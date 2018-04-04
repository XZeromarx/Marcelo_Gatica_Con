package cl.XZeromarx.model;
/**
 *
 * @author XZeroMarx
 */
public class Curso {
    
    private String nombre;
    private int matricula;
    private int mensualidad;
    private int duracion;
    
    public Curso() {
    }

    public Curso(int matricula, int mensualidad, int duracion, String nombre) {
        this.matricula = matricula;
        this.mensualidad = mensualidad;
        this.duracion = duracion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(int mensualidad) {
        this.mensualidad = mensualidad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    
    
}
