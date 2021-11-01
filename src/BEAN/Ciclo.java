package BEAN;

public class Ciclo {
    private int idCiclo;
    private String descrip;

    public Ciclo() {
    }

    public Ciclo(int idCiclo, String descrip) {
        this.idCiclo = idCiclo;
        this.descrip = descrip;
    }

    public int getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(int idCiclo) {
        this.idCiclo = idCiclo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    
}
