package Persistencia.Impl;

import BEAN.DetMatricula;
import Persistencia.DAO.DetMatriculaDAO;
import UTIL.BDUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DetMatriculaDAOImpl implements DetMatriculaDAO{

    @Override
    public boolean insertar(DetMatricula dm) {
    boolean sw = false;
        try {
            Connection cn = BDUtil.getConnection();
           
            String sql = "INSERT INTO Det_Matricula VALUES (?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, dm.getIdMatricula());
            ps.setInt(2, dm.getIdCurso());
            
            int ret = ps.executeUpdate();

            if (ret > 0) {
                sw = true;
            }
            ps.close();
            cn.close();
        } catch (Exception e) {
            System.err.println("Error de insertar CabReceta "+ e.getMessage());
        }
        return sw;        }

        
}
    

