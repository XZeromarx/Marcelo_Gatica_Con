package cl.XZeromarx.model;
/**
 *
 * @author XZeroMarx
 */
public class Matricula {
    
    private String rut;
    private String sexo;
    private String nombre;
    private String direccion;
    private String curso;
    private String valorMatricula;
    private String totalMatricula;
    private String mensualidad;
    private boolean convenio;
    private String tipoConvenio;
    private String descuentoConvenio;
    private String totalFinal;
    private String cuotas;
    private String totalCuotas;

    public Matricula() {
    }

    public Matricula(String rut, String sexo, String nombre, String direccion, String curso, String valorMatricula, String totalMatricula, String mensualidad, boolean convenio, String tipoConvenio, String descuentoConvenio, String totalFinal, String cuotas, String totalCuotas) {
        this.rut = rut;
        this.sexo = sexo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.curso = curso;
        this.valorMatricula = valorMatricula;
        this.totalMatricula = totalMatricula;
        this.mensualidad = mensualidad;
        this.convenio = convenio;
        this.tipoConvenio = tipoConvenio;
        this.descuentoConvenio = descuentoConvenio;
        this.totalFinal = totalFinal;
        this.cuotas = cuotas;
        this.totalCuotas = totalCuotas;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(String valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    public String getTotalMatricula() {
        return totalMatricula;
    }

    public void setTotalMatricula(String totalMatricula) {
        this.totalMatricula = totalMatricula;
    }

    public String getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(String mensualidad) {
        this.mensualidad = mensualidad;
    }

    public boolean isConvenio() {
        return convenio;
    }

    public void setConvenio(boolean convenio) {
        this.convenio = convenio;
    }

    public String getTipoConvenio() {
        return tipoConvenio;
    }

    public void setTipoConvenio(String tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }

    public String getDescuentoConvenio() {
        return descuentoConvenio;
    }

    public void setDescuentoConvenio(String descuentoConvenio) {
        this.descuentoConvenio = descuentoConvenio;
    }

    public String getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(String totalFinal) {
        this.totalFinal = totalFinal;
    }

    public String getCuotas() {
        return cuotas;
    }

    public void setCuotas(String cuotas) {
        this.cuotas = cuotas;
    }

    public String getTotalCuotas() {
        return totalCuotas;
    }

    public void setTotalCuotas(String totalCuotas) {
        this.totalCuotas = totalCuotas;
    }

    
    
    
    
}
