/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Impl;

import BEAN.CabMatricula;
import Persistencia.DAO.CabMatriculaDAO;
import UTIL.BDUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author leo59
 */
public class CabMatriculaDAOImpl implements CabMatriculaDAO {

    @Override
    public boolean insertar(CabMatricula cm) {
         boolean sw = false;
        try {
            Connection cn = BDUtil.getConnection();
           
            String sql = "INSERT INTO Cab_Matricula VALUES (?,?,GETDATE(),1,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, cm.getIdMatricula());
            ps.setInt(2, cm.getIdAlumno());
            ps.setInt(3, cm.getIdCiclo());
            int ret = ps.executeUpdate();

            if (ret > 0) {
                sw = true;
            }
            ps.close();
            cn.close();
        } catch (Exception e) {
            System.err.println("Error de insertar CabReceta "+ e.getMessage());
        }
        return sw;    
    }
    
}
