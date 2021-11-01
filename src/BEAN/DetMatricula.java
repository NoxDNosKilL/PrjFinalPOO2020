package BEAN;

public class DetMatricula {
    private int idMatricula;
    private int idCurso;

    public DetMatricula() {
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public DetMatricula(int idMatricula, int idCurso) {
        this.idMatricula = idMatricula;
        this.idCurso = idCurso;
    }

    @Override
    public String toString() {
        return "DetMatricula{" + "idMatricula=" + idMatricula + ", idCurso=" + idCurso + '}';
    }
    
}
