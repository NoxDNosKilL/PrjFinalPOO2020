package BEAN;

public class CabMatricula {
    private int idMatricula;
    private int idAlumno;
    private String fechaMat;
    private int estado;
    private int idCiclo;

    public CabMatricula() {
    }

    public CabMatricula(int idMatricula, int idAlumno, String fechaMat, int estado, int idCiclo) {
        this.idMatricula = idMatricula;
        this.idAlumno = idAlumno;
        this.fechaMat = fechaMat;
        this.estado = estado;
        this.idCiclo = idCiclo;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getFechaMat() {
        return fechaMat;
    }

    public void setFechaMat(String fechaMat) {
        this.fechaMat = fechaMat;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(int idCiclo) {
        this.idCiclo = idCiclo;
    }
            
}
