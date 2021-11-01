
package BEAN;


public class Curso {
    private int idCurso;
    private String nombre;
    private int idTipo;
    private int creditos;
    private int horas;
    private int estado;

    public Curso(int idCurso, String nombre, int idTipo, int creditos, int horas, int estado) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.idTipo = idTipo;
        this.creditos = creditos;
        this.horas = horas;
        this.estado = estado;
    }

    public Curso() {
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Curso{" + "idCurso=" + idCurso + ", nombre=" + nombre + ", idTipo=" + idTipo + ", creditos=" + creditos + ", horas=" + horas + ", estado=" + estado + '}';
    }
    
}
